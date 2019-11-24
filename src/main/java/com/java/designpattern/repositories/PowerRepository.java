package com.java.designpattern.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.designpattern.models.Power;

@Repository
public interface PowerRepository extends JpaRepository<Power, Long>{

}
