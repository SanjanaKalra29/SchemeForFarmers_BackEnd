package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CropDetails")
public class Crop {
	@Id
	@GeneratedValue
	@Column(name = "Cropid")
	private int id;
	
	private String name;
	
	private String crop_type;
	
	private String fertilizer_type;
	
	private int quantity;
	
	private int soil_pH;
	
	private LocalDate date_added_on;
	
	private int base_price;
	
	private String farmer_id;
	
	private String status;
	
	private LocalDate start_date;
	
	private LocalDate end_date;

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

	public String getCrop_type() {
		return crop_type;
	}

	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}

	public String getFertilizer_type() {
		return fertilizer_type;
	}

	public void setFertilizer_type(String fertilizer_type) {
		this.fertilizer_type = fertilizer_type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSoil_pH() {
		return soil_pH;
	}

	public void setSoil_pH(int soil_pH) {
		this.soil_pH = soil_pH;
	}

	public LocalDate getDate_added_on() {
		return date_added_on;
	}

	public void setDate_added_on(LocalDate date_added_on) {
		this.date_added_on = date_added_on;
	}

	public int getBase_price() {
		return base_price;
	}

	public void setBase_price(int base_price) {
		this.base_price = base_price;
	}

	public String getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(String farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	
}
