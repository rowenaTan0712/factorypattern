package com.java.factorypattern.services;

import com.java.factorypattern.dtos.PersonDTO;

public abstract class AbstractDuel<T> {
	
	public abstract String fight(T person);
	
	public String heal(PersonDTO person) {
		return person.isHero() ? "Hero "+person.getAlias()+" has been healed." : 
			"Villain "+person.getAlias()+" has been healed. ";
	}
}
