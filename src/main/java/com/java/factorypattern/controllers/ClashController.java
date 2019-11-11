package com.java.factorypattern.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.factorypattern.dtos.PowerDTO;
import com.java.factorypattern.services.PowerManagement;

@RestController
@RequestMapping("/clash")
public class ClashController {
	
	@Autowired
	private PowerManagement powerMng;
	
	@PostMapping
	public PowerDTO addPower (@RequestBody @Valid PowerDTO power) {
		return powerMng.savePower(power); 
	}
	
	@PutMapping
	public PowerDTO updatePower (@RequestBody @Valid PowerDTO power) {
		return powerMng.savePower(power); 
	}
	
	@GetMapping
	public List<PowerDTO> retrievePowers () {
		return powerMng.getPowers();
	}
	
	@DeleteMapping("/{id}")
	public String removePower (@PathVariable Long id ) {
		return powerMng.removePower(id);
	}
	
	@GetMapping("/{id}")
	public Optional<PowerDTO> getPowerById (@PathVariable Long id) {
		return powerMng.getPower(id);
	}
	
	//fight
}
