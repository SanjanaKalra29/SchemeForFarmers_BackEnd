package com.lti.dto;

public class bidsDto {

	private int farmerid;
	private int bidderid;
	private int cropid;
	private double amount;

	public int getFarmerid() {
		return farmerid;
	}

	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}

	public int getBidderid() {
		return bidderid;
	}

	public void setBidderid(int bidderid) {
		this.bidderid = bidderid;
	}

	public int getCropid() {
		return cropid;
	}

	public void setCropid(int cropid) {
		this.cropid = cropid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
