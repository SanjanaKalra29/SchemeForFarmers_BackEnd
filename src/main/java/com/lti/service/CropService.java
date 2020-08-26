package com.lti.service;

import java.util.List;

import com.lti.dto.CropDto;
import com.lti.entity.Crop;

public interface CropService {

	void register(CropDto cropdto);

	List<Crop> getCrops();

}
