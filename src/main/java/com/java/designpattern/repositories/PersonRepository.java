package com.java.designpattern.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.designpattern.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
