package com.java.factorypattern.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.factorypattern.models.Power;

@Repository
public interface PowerRepository extends JpaRepository<Power, Long>{

}
