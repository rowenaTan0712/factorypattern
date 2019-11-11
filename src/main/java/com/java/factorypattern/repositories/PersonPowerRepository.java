package com.java.factorypattern.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.factorypattern.models.PersonPower;

@Repository
public interface PersonPowerRepository extends JpaRepository<PersonPower, Long>{

}
