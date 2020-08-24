package com.lti.dto;

public class CropDto {

	private String crop_type;
	private String name;
	private String fertilizer_type;
	private int quantity;
	private int soil_pH;
	
	public String getCrop_type() {
		return crop_type;
	}
	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
}
