package com.java.factorypattern.services;

import java.util.List;
import java.util.Optional;

import com.java.factorypattern.dtos.PowerDTO;

public interface PowerManagement {
	
	public PowerDTO savePower (PowerDTO power);
	public List<PowerDTO> getPowers ();
	public String removePower (Long id);
	public Optional<PowerDTO> getPower (Long id);
}
