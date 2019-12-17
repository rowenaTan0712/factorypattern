package com.java.designpattern.services.implementations;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.designpattern.dtos.PersonDTO;
import com.java.designpattern.exceptions.CustomUncheckException;
import com.java.designpattern.models.Person;
import com.java.designpattern.repositories.PersonRepository;
import com.java.designpattern.services.PersonManagement;

@Service
public class PersonManagementImpl implements PersonManagement{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public PersonDTO savePerson(PersonDTO person) throws IllegalArgumentException{
		try {
			Person account = new Person();
			
			if(person.getId() != null && person.getId() != 0) {
				Optional<Person> searchedAccount = personRepository.findById(person.getId());
				if(searchedAccount.isPresent()) {
					account.setCreateDate(searchedAccount.get().getCreateDate());
					account.setAlias(person.getAlias() != null ? person.getAlias() : searchedAccount.get().getAlias());
					account.setIdentification(person.getIdentification());
					account.setFirstName(person.getFirstName() != null ? person.getFirstName() : searchedAccount.get().getFirstName());
					account.setLastName(person.getLastName() != null ? person.getLastName() : searchedAccount.get().getLastName());
					account.setUpdateDate(new Date());
				}
			}else {
				account.setAlias(person.getAlias());
				account.setCreateDate(new Date());
				account.setFirstName(person.getFirstName());
				account.setHero(person.isHero());
				account.setLastName(person.getLastName());
			}
			
			account.setHero(person.isHero());
			Person personDetails = personRepository.save(account);
			PersonDTO result = new PersonDTO(personDetails.getFirstName(), personDetails.getLastName(), personDetails.getAlias(), 
					personDetails.isHero(), personDetails.getCreateDate(), person.getUpdateDate());
			result.setIdentification(personDetails.getIdentification());
			
			return result;
		}catch (IllegalArgumentException e) {
			String type = person.isHero() ? "Hero " : "Villain ";
			throw new CustomUncheckException("The "+type+" has an error on saving. ", e);
		}
	}

	@Override
	public String deletePerson(Long id) throws IllegalArgumentException{
		try {
			Optional<Person> person = personRepository.findById(id);
			String result = "";
			if(person.isPresent()) {
				personRepository.deleteById(id);
				StringBuilder builder = new StringBuilder();
				builder.append("The ");
				builder.append(person.get().isHero() ? "Hero " : "Villain ");
				builder.append("has been remove.");
				result = builder.toString();
			}else {
				result = "No records found for this account id.";
			}
			return result;
		}catch(IllegalArgumentException e) {
			throw new CustomUncheckException("Deleting this account encountered a problem.", e);
		}
	}

	@Override
	public List<PersonDTO> getPersons() {
		List<PersonDTO> results = personRepository.findAll().stream().map(d -> {
									PersonDTO p  = new PersonDTO 
												(d.getFirstName(), 
												 d.getLastName(), 
												 d.getAlias(), 
												 d.isHero(), 
												 d.getCreateDate(), 
												 d.getUpdateDate());
									p.setIdentification(d.getIdentification());
									return p;
		}).collect(Collectors.toList());
		return results;
	}

	@Override
	public PersonDTO getPerson(Long id) throws IllegalArgumentException{
		try {
			Optional<Person> person = personRepository.findById(id);
			PersonDTO result = new PersonDTO();
			if(person.isPresent()) {
				 result = new PersonDTO(person.get().getFirstName(), 
						person.get().getLastName(), 
						person.get().getAlias(), 
						person.get().isHero(), 
						person.get().getCreateDate(), 
						person.get().getUpdateDate());
				result.setIdentification(person.get().getIdentification());
			}
			return result;
		}catch(IllegalArgumentException e) {
			throw new CustomUncheckException("Finding this account encountered a problem.", e);
		}
	}
}
