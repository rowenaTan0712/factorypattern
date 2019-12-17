package com.java.designpattern.workflows;

public class ObjectInitializer {
	
	public AccountManagement getType (boolean isHero) {
		
		return isHero ? new HeroAccountManagement() : new VillainAccountManagement();
	}
}
