package com.java.designpattern.dtos;

import java.util.Date;
import java.util.List;

public class VillainDTO extends PersonDTO{
	
	public VillainDTO () {
		
	}
	
	public VillainDTO(Long id, Long identification, String firstName, String lastName, String alias, boolean hero,
			Date createDate, Date updateDate) {
		super(firstName, lastName, alias, hero, createDate, updateDate);
	}

	private List<PowerDTO> powers;

	public List<PowerDTO> getPowers() {
		return powers;
	}

	public void setPowers(List<PowerDTO> powers) {
		this.powers = powers;
	}
}
