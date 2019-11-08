package com.java.factorypattern.daos;

import java.util.Date;
import java.util.List;

public class Hero extends Person{
	
	public Hero(Long id, Long identification, String firstName, String lastName, String alias, boolean hero,
			Date createDate, Date updateDate) {
		super(firstName, lastName, alias, hero, createDate, updateDate);
	}

	private List<Power> powers;

	public List<Power> getPowers() {
		return powers;
	}

	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
}
