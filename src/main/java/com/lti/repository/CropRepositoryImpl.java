package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Crop;

@Repository
public class CropRepositoryImpl implements CropRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void save(Crop crop) {
		entityManager.persist(crop);
	}

}
