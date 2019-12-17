package com.java.designpattern.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.designpattern.dtos.VillainDTO;
import com.java.designpattern.workflows.ObjectInitializer;

@RestController
@RequestMapping("/factory/pattern/villain")
public class VillainController {
	
	@Autowired
	private ObjectInitializer objectInit;
	
	@PostMapping
	public ResponseEntity<VillainDTO> addVillain (@RequestBody @Valid VillainDTO villain){
		return objectInit.getType(false).addVillain(villain);
	}
}
