package com.app.robot.dto;

import java.io.Serializable;

import com.app.robot.ui.model.response.LocationResponse;
import com.app.robot.ui.model.response.ResourcesResponse;

public class ResourcesDTO implements Serializable {

	private static final long serialVersionUID = -3203966255378725427L;

	private String resourceId;
	private boolean water;
	private boolean food;
	private boolean medication;
	private boolean ammunition;
	private SurvivorDTO survivorDetails;

	public SurvivorDTO getSurvivorDetails() {
		return survivorDetails;
	}

	public void setSurvivorDetails(SurvivorDTO survivorDetails) {
		this.survivorDetails = survivorDetails;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isMedication() {
		return medication;
	}

	public void setMedication(boolean medication) {
		this.medication = medication;
	}

	public boolean isAmmunition() {
		return ammunition;
	}

	public void setAmmunition(boolean ammunition) {
		this.ammunition = ammunition;
	}

}
