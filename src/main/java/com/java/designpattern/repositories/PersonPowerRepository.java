package com.java.designpattern.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.designpattern.models.PersonPower;

@Repository
public interface PersonPowerRepository extends JpaRepository<PersonPower, Long>{
	
	public List<PersonPower> findByPersonId (Long personId);
}
