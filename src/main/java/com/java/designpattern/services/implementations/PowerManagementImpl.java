package com.java.designpattern.services.implementations;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.designpattern.dtos.PowerDTO;
import com.java.designpattern.exceptions.CustomUncheckException;
import com.java.designpattern.models.Power;
import com.java.designpattern.repositories.PowerRepository;
import com.java.designpattern.services.PowerManagement;

@Service
public class PowerManagementImpl implements PowerManagement{
	
	@Autowired
	private PowerRepository powerRepository;
	
	@Override
	public PowerDTO savePower(PowerDTO power) throws IllegalArgumentException {
		try {
			Power powerToSave = new Power();
			if(power.getId() != null) {
				powerToSave.setUpdateDate(new Date());
				powerToSave.setId(power.getId());
				
				Optional<Power> powerData = powerRepository.findById(power.getId());
				if(powerData.isPresent()) {
					powerToSave.setName(power.getName() != null ? power.getName() : powerData.get().getName());
					powerToSave.setType(power.getType() != null ? power.getType() : powerData.get().getType());
					powerToSave.setLevel(power.getLevel() != 0 ? power.getLevel() : powerData.get().getLevel());
					powerToSave.setRange(power.getRange() != 0 ? power.getRange() : powerData.get().getRange());
					powerToSave.setCreateDate(powerData.get().getCreateDate());
				}
			}else {
				powerToSave.setCreateDate(new Date());
				powerToSave.setLevel(1);
				powerToSave.setRange(20);
				powerToSave.setName(power.getName());
				powerToSave.setType(power.getType());
			}
			
			Power resPow = powerRepository.save(powerToSave);
			return  new PowerDTO(resPow.getId(), resPow.getName(), resPow.getType(), resPow.getLevel(),
					resPow.getRange(), resPow.getCreateDate(), resPow.getUpdateDate());
		}catch(IllegalArgumentException e) {
			throw new CustomUncheckException("The power you have save is incomplete.", e);
		}
	}

	@Override
	public List<PowerDTO> getPowers() {
		return powerRepository.findAll().stream().map(d -> new PowerDTO(d.getId(), 
					d.getName(), d.getType(), d.getLevel(), d.getRange(), d.getCreateDate(), 
					d.getUpdateDate())).collect(Collectors.toList());
	}

	@Override
	public String removePower(Long id) throws IllegalArgumentException{
		try {
			powerRepository.deleteById(id);
			return "The power has been removed. ";
		}catch(IllegalArgumentException e) {
			throw new CustomUncheckException("This power is unknown. ", e);
		}
	}

	@Override
	public Optional<PowerDTO> getPower(Long id) throws IllegalArgumentException {
		try {
			return powerRepository.findById(id).map(d -> new PowerDTO(d.getId(), d.getName(), 
					d.getType(), d.getLevel(), d.getRange(), d.getCreateDate(), d.getUpdateDate()));
		}catch(IllegalArgumentException e) {
			throw new CustomUncheckException("This power was not yet listed. ", e);
		}
	}
}
