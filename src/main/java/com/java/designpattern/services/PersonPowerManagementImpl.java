package com.java.designpattern.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.designpattern.exceptions.CustomUncheckException;
import com.java.designpattern.models.PersonPower;
import com.java.designpattern.models.Power;
import com.java.designpattern.repositories.PersonPowerRepository;
import com.java.designpattern.repositories.PowerRepository;

@Service
public class PersonPowerManagementImpl implements PersonPowerManagement{
	
	@Autowired
	private PersonPowerRepository ppRepository;
	
	@Autowired
	private PowerRepository powerRepository;

	@Override
	public List<String> saveMapping(List<PersonPower> personPower) throws IllegalArgumentException {
		try {
			List<PersonPower> quirks = ppRepository.saveAll(personPower);
			List<String> quirkResults = new ArrayList<String>();
			for(PersonPower pp : quirks) {
				Optional<Power> power = powerRepository.findById(pp.getPowerId());
				if(power.isPresent()) {
					quirkResults.add(power.get().getName());
				}
			}
			return quirkResults;
		}catch (IllegalArgumentException e) {
			throw new CustomUncheckException("Error in saving quirks.", e);
		}
	}

	@Override
	public List<Power> findPowers(Long personId) throws IllegalArgumentException {
		try {
			List<Power> quirks = new ArrayList<Power>();
			List<PersonPower> pps = ppRepository.findByPersonId(personId);
			for(PersonPower pp : pps) {
				Optional<Power> power = powerRepository.findById(pp.getPowerId());
				if(power.isPresent()) {
					quirks.add(power.get());
				}
			}
			return quirks;
		}catch (IllegalArgumentException e) {
			throw new CustomUncheckException("Error in finding quirks. ", e);
		}
	}
}
