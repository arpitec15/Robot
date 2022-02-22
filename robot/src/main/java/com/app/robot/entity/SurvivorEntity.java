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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.app.robot.ui.model.request.Location;
import com.app.robot.ui.model.request.Resources;

@Entity
@Table(name = "survivor")
public class SurvivorEntity implements Serializable {

	private static final long serialVersionUID = 5670543469719997960L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String survivorId;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Integer age;

	@Column(nullable = false)
	private String gender;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = LocationEntity.class)
	@JoinColumn(name = "location_id")
	private LocationEntity location;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = ResourceEntity.class)
	@JoinColumn(name = "resource_id")
	private ResourceEntity resources;

	@Column(nullable = false)
	private boolean isInfected;

	public SurvivorEntity() {
	}

	public boolean isInfected() {
		return isInfected;
	}

	public void setInfected(boolean isInfected) {
		this.isInfected = isInfected;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocationEntity getLocation() {
		return location;
	}

	public void setLocation(LocationEntity location) {
		this.location = location;
	}

	public ResourceEntity getResources() {
		return resources;
	}

	public void setResources(ResourceEntity resources) {
		this.resources = resources;
	}

}
