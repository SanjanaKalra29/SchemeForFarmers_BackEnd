package com.lti.dto;

import java.util.List;

import com.lti.entity.Crop;
import com.lti.status.Status;

public class CropsDto {

	private List<Crop> crops;
	private Status status;

	public List<Crop> getCrops() {
		return crops;
	}

	public void setCrops(List<Crop> crops) {
		this.crops = crops;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
