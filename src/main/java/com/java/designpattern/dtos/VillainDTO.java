package com.java.designpattern.dtos;

import java.util.List;

public class VillainDTO extends PersonDTO{
	
	public VillainDTO () {
		
	}
	
	public VillainDTO(String firstName, String lastName, String alias, boolean hero) {
		super(firstName, lastName, alias, hero);
	}

	private List<PowerDTO> powers;

	public List<PowerDTO> getPowers() {
		return powers;
	}

	public void setPowers(List<PowerDTO> powers) {
		this.powers = powers;
	}
}
