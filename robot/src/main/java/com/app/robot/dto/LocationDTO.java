package com.app.robot.dto;

import java.io.Serializable;

public class LocationDTO implements Serializable {

	private static final long serialVersionUID = -3692060615396825794L;

	private String locationId;
	private String latitude;
	private String longitude;
	private SurvivorDTO survivorDetails;

	public SurvivorDTO getSurvivorDetails() {
		return survivorDetails;
	}

	public void setSurvivorDetails(SurvivorDTO survivorDetails) {
		this.survivorDetails = survivorDetails;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
