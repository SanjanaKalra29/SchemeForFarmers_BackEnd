package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Crop;
import com.lti.exception.UserServiceException;
import com.lti.repository.CropRepository;

@Service
public class CropServiceImpl implements CropService {

	@Autowired
	private CropRepository cropRepo;

	@Override
	public void register(Crop crop) {
		cropRepo.save(crop);
	}
}
