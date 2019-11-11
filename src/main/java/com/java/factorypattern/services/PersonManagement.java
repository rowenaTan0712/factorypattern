package com.java.factorypattern.services;

import java.util.List;

public interface PersonManagement<T> {
	
	public T savePerson(T person);
	public String deletePerson(T person);
	public List<T> getPersons();
	public T getPerson(Long id);
}
