package com.java.designpattern.services;

import java.util.List;

import com.java.designpattern.dtos.PersonDTO;

public interface PersonManagement {
	
	public PersonDTO savePerson(PersonDTO person);
	public String deletePerson(Long id);
	public List<PersonDTO> getPersons();
	public PersonDTO getPerson(Long id);
}
