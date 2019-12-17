package com.java.designpattern.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.designpattern.dtos.HeroDTO;
import com.java.designpattern.workflows.ObjectInitializer;

@RestController
@RequestMapping("/factory/pattern/hero")
public class HeroController {
	
	@Autowired
	private ObjectInitializer objectInit;
	
	@PostMapping
	public ResponseEntity<HeroDTO> addHero (@RequestBody @Valid HeroDTO hero){
		return objectInit.getType(true).addHero(hero);
	}
}
