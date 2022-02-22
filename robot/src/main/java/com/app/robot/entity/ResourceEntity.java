package com.app.robot.entity;

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
@Table(name = "resource")
public class ResourceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String resourceId;

	@Column(nullable = false)
	private boolean water;

	@Column(nullable = false)
	private boolean food;

	@Column(nullable = false)
	private boolean medication;

	@Column(nullable = false)
	private boolean ammunition;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "resources")
	private SurvivorEntity survivorResource;

	
	public ResourceEntity() {
		// TODO Auto-generated constructor stub
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

	public SurvivorEntity getSurvivorResource() {
		return survivorResource;
	}

	public void setSurvivorResource(SurvivorEntity survivorResource) {
		this.survivorResource = survivorResource;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	
	

}
