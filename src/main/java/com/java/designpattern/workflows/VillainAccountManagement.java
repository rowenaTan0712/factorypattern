package com.java.designpattern.workflows;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.designpattern.dtos.HeroDTO;
import com.java.designpattern.dtos.PersonDTO;
import com.java.designpattern.dtos.PowerDTO;
import com.java.designpattern.dtos.VillainDTO;
import com.java.designpattern.models.PersonPower;
import com.java.designpattern.services.PersonManagement;
import com.java.designpattern.services.PersonPowerManagement;

@Service/*("villainAcctMng")*/
public class VillainAccountManagement extends AccountManagement{
	
	@Autowired
	private PersonManagement personMng;
	
	@Autowired
	private PersonPowerManagement personPowerMng;
	
	@Override
	public ResponseEntity<VillainDTO> addVillain(VillainDTO villain) {
		PersonDTO person = (PersonDTO)villain;
		PersonDTO details = personMng.savePerson(person);
		List<PersonPower> powers = villain.getPowers().stream()
				.map(p -> new PersonPower(details.getId(), p.getId())).collect(Collectors.toList());
		List<String> savedPower = personPowerMng.saveMapping(powers);
		List<PowerDTO> powerDtos = savedPower.stream().map(d -> {
									PowerDTO pd = new PowerDTO();
									pd.setName(d);
									return pd; }).collect(Collectors.toList());
		VillainDTO savedVillain = new VillainDTO();
		savedVillain = (VillainDTO) details;
		savedVillain.setPowers(powerDtos);
		return new ResponseEntity<>(savedVillain, HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<VillainDTO> updateVillain (VillainDTO Villain) {
		return null;
	}
	
	@Override
	public ResponseEntity<VillainDTO> deleteVillain (Long id) {
		return null;
	}
	
	@Override
	public ResponseEntity<VillainDTO> getVillainDetails (Long id) {
		return null;
	}

	@Override
	public ResponseEntity<HeroDTO> addHero(HeroDTO hero) {
		return null;
	}

	@Override
	public ResponseEntity<HeroDTO> updateHero(HeroDTO hero) {
		return null;
	}

	@Override
	public ResponseEntity<HeroDTO> deleteHero(Long id) {
		return null;
	}

	@Override
	public ResponseEntity<HeroDTO> getHeroDetails(Long id) {
		return null;
	}

}
