package com.app.robot.ui.model.response;

public class ResourcesResponse {

	private String resourceId;
	private boolean water;
	private boolean food;
	private boolean medication;
	private boolean ammunition;

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
