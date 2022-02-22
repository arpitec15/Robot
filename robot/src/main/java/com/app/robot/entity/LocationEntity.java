package com.app.robot.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "location")
public class LocationEntity implements Serializable {

	private static final long serialVersionUID = -4460858633594126623L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String locationId;

	@Column(nullable = false)
	private String longitude;

	@Column(nullable = false)
	private String latitude;

//	@JoinColumn(name = "location_id", referencedColumnName = "id")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "location")
	private SurvivorEntity survivorLocation;

	public LocationEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public SurvivorEntity getSurvivorLocation() {
		return survivorLocation;
	}

	public void setSurvivorLocation(SurvivorEntity survivorLocation) {
		this.survivorLocation = survivorLocation;
	}

}
