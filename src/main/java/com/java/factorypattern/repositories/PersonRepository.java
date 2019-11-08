package com.java.factorypattern.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.factorypattern.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
