package com.java.designpattern.factorypattern;

public class AccountManagementImpl {
	
	public AccountManagement getType (boolean isHero) {
		
		return isHero ? new HeroAccountManagement() : new VillainAccountManagement();
	}
}
