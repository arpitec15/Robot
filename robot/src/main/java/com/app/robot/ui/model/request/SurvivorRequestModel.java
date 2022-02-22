package com.app.robot.ui.model.request;

public class SurvivorRequestModel {

	private String name;
	private Integer age;
	private String gender;
	private Location location;
	private Resources resources;
	private Boolean isInfected;
	
	

	public Boolean getIsInfected() {
		return isInfected;
	}

	public void setIsInfected(Boolean isInfected) {
		this.isInfected = isInfected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Resources getResources() {
		return resources;
	}

	public void setResources(Resources resources) {
		this.resources = resources;
	}

}
