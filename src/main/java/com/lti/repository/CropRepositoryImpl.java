package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Crop;

@Repository
public class CropRepositoryImpl implements CropRepository{

	@PersistenceContext // @Autowired does not work for injecting EntityManager
	private EntityManager entityManager;

	@Transactional
	@Override
	public void save(Crop crop) {
		entityManager.persist(crop);
	}
	
	@Override
	public boolean isCropPresent(int id){
		return (Integer) entityManager
				.createQuery("select count(c.id) from Crop c where c.id = :c")
				.setParameter("c", id)
				.getSingleResult() == 1 ? true : false;
	}
}
