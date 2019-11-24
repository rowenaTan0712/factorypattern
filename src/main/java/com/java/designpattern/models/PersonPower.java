package com.java.designpattern.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_powers")
public class PersonPower {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="person_id")
	private Long personId;
	
	@Column(name="power_id")
	private Long powerId;
	
	public PersonPower(Long id, Long personId, Long powerId) {
		super();
		this.id = id;
		this.personId = personId;
		this.powerId = powerId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public Long getPowerId() {
		return powerId;
	}
	public void setPowerId(Long powerId) {
		this.powerId = powerId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonPowers [id=");
		builder.append(id);
		builder.append(", personId=");
		builder.append(personId);
		builder.append(", powerId=");
		builder.append(powerId);
		builder.append("]");
		return builder.toString();
	}
}
