package com.java.factorypattern.dtos;

import java.util.Date;

public class PersonDTO {
	private Long id;
	private Long identification;
	private String firstName;
	private String lastName;
	private String alias;
	private boolean hero;
	private Date createDate;
	private Date updateDate;
	
	public PersonDTO(String firstName, String lastName, String alias, boolean hero,
			Date createDate, Date updateDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.alias = alias;
		this.hero = hero;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public boolean isHero() {
		return hero;
	}
	public void setHero(boolean hero) {
		this.hero = hero;
	}
	public Long getIdentification() {
		return identification;
	}
	public void setIdentification(Long identification) {
		this.identification = identification;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", identification=");
		builder.append(identification);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", alias=");
		builder.append(alias);
		builder.append(", hero=");
		builder.append(hero);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append("]");
		return builder.toString();
	}
}
