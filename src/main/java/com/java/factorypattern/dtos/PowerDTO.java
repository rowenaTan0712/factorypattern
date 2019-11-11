package com.java.factorypattern.dtos;

import java.util.Date;

public class PowerDTO {
	
	public PowerDTO(Long id, String name, String type, int level, int range, Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.level = level;
		this.range = range;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	private Long id;
	private String name;
	private String type;
	private int level;
	private int range;
	private Date createDate;
	private Date updateDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Power [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", level=");
		builder.append(level);
		builder.append(", range=");
		builder.append(range);
		builder.append("]");
		return builder.toString();
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
}
