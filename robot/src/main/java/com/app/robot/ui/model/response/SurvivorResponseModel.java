package com.app.robot.ui.model.response;

public class SurvivorResponseModel {

	private String survivorId;
	private String name;
	private Integer age;
	private String gender;
	private Long id;
	private LocationResponse location;
	private ResourcesResponse resources;
	private Boolean isInfected;
	
	

	public Boolean getIsInfected() {
		return isInfected;
	}

	public void setIsInfected(Boolean isInfected) {
		this.isInfected = isInfected;
	}

	public String getSurvivorId() {
		return survivorId;
	}

	public void setSurvivorId(String survivorId) {
		this.survivorId = survivorId;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocationResponse getLocation() {
		return location;
	}

	public void setLocation(LocationResponse location) {
		this.location = location;
	}

	public ResourcesResponse getResources() {
		return resources;
	}

	public void setResources(ResourcesResponse resources) {
		this.resources = resources;
	}

}
