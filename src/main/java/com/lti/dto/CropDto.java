package com.lti.dto;

import java.time.LocalDate;

public class CropDto {

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
