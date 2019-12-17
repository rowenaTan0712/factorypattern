package com.java.designpattern.workflows;

import org.springframework.http.ResponseEntity;

import com.java.designpattern.dtos.HeroDTO;
import com.java.designpattern.dtos.VillainDTO;

public abstract class AccountManagement {
	
	public abstract ResponseEntity<HeroDTO> addHero(HeroDTO hero);
	public abstract ResponseEntity<HeroDTO> updateHero (HeroDTO hero);
	public abstract ResponseEntity<HeroDTO> deleteHero (Long id);
	public abstract ResponseEntity<HeroDTO> getHeroDetails (Long id);
	
	public abstract ResponseEntity<VillainDTO> addVillain(VillainDTO villain);
	public abstract ResponseEntity<VillainDTO> updateVillain (VillainDTO Villain);
	public abstract ResponseEntity<VillainDTO> deleteVillain (Long id);
	public abstract ResponseEntity<VillainDTO> getVillainDetails (Long id);
}
