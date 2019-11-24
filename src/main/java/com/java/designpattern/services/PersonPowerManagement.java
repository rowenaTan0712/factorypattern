package com.java.designpattern.services;

import java.util.List;

import com.java.designpattern.models.PersonPower;
import com.java.designpattern.models.Power;

public interface PersonPowerManagement {
	
	public List<String> saveMapping (List<PersonPower> personPower);
	
	public List<Power> findPowers (Long id);
}
