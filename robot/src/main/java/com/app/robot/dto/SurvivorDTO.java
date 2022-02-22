package com.app.robot.dto;

import java.io.Serializable;

import com.app.robot.ui.model.response.LocationResponse;
import com.app.robot.ui.model.response.ResourcesResponse;

public class SurvivorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String survivorId;
	private String name;
	private Integer age;
	private String gender;
	private Long id;
	private LocationDTO location;
	private ResourcesDTO resources;
	private boolean isInfected;

	public boolean isInfected() {
		return isInfected;
	}

	public void setInfected(boolean isInfected) {
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

	public LocationDTO getLocation() {
		return location;
	}

	public void setLocation(LocationDTO location) {
		this.location = location;
	}

	public ResourcesDTO getResources() {
		return resources;
	}

	public void setResources(ResourcesDTO resources) {
		this.resources = resources;
	}

}
