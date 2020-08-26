package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lti.dto.CropDto;
import com.lti.entity.Crop;
import com.lti.entity.User;
import com.lti.exception.CropServiceException;
import com.lti.repository.CropRepository;
import com.lti.repository.UserRepository;

@Service
public class CropServiceImpl implements CropService {

	@Autowired
	private CropRepository cropRepo;
	@Autowired
	private UserRepository userRepo;

	@Override
	public void register(CropDto cropdto) {

		try {
			System.out.println(cropdto.getFarmerid());
			User farmer = userRepo.findbyId(cropdto.getFarmerid());
			System.out.println(farmer.getRole() + " ROle");
			if (farmer.getRole().equals("Bidder")) {
				throw new CropServiceException("Bidder not allowed to add Crop");
			}
			Crop crop = cropdto.getCrop();
			crop.setUser(farmer);
			cropRepo.save(crop);
		} catch (EmptyResultDataAccessException e) {
			throw new CropServiceException("You are not allowed to add Crop");
		}

	}

	@Override
	public List<Crop> getCrops() {
		try {
			List<Crop> crops = cropRepo.findCrops();
			return crops;
		} catch (EmptyResultDataAccessException e) {
			throw new CropServiceException("You are not allowed to add Crop");
		}
	}
}
