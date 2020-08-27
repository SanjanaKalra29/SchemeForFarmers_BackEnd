package com.lti.repository;

import java.util.List;

import com.lti.entity.Crop;

public interface CropRepository {

	void save(Crop crop);

	List<Crop> findCrops();

	Crop findbyId(int id);

	double getBasePrice(int id);

}
