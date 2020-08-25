package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CropDetails")
public class Crop {
	@Id
	@GeneratedValue
	@Column(name = "Cropid")
	private int id;
	
	private String name;
	
	private String cropType;
	
	private String fertilizerType;
	
	private int quantity;
	
	private double soilPH;
	
	private LocalDate dateAddedOn;
	
	private double basePrice;
	
	private int farmerId;
	
	private String status;
	
	private LocalDate startDate;
	
	private LocalDate endDate;

	@OneToOne
	@JoinColumn(name= "User_id") //FK
	private User user;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSoilPH() {
		return soilPH;
	}

	public void setSoilPH(double soilPH) {
		this.soilPH = soilPH;
	}

	public LocalDate getDateAddedOn() {
		return dateAddedOn;
	}

	public void setDateAddedOn(LocalDate dateAddedOn) {
		this.dateAddedOn = dateAddedOn;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}


