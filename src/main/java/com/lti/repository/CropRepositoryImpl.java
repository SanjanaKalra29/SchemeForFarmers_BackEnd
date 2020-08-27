package com.lti.repository;

import java.util.List;

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

	@Override
	@Transactional
	public List<Crop> findCrops() {

		List crops = entityManager.createNamedQuery("getCrops").getResultList();
		return crops;
	}

	@Override
	public Crop findbyId(int id) {
		return entityManager.find(Crop.class, id);
	}

	@Override
	public double getBasePrice(int id) {
		return (Double) entityManager.createQuery("select b.basePrice from Crop b where b.id = :cid")
				.setParameter("cid", id).getSingleResult();
	}

	@Override
	public List<Crop> findExpiredCrops() {

		List crops = entityManager
				.createQuery("select c from Crop c where c.endDate < sysdate and c.status = 'Available'")
				.getResultList();
		return crops;
	}

	@Override
	public List<Crop> findSoldCropsbyFarmerId(int id) {

		List crops = entityManager.createQuery("select c from Crop c where c.user.id = :cid and c.status = 'Sold'")
				.setParameter("cid", id).getResultList();
		return crops;
	}

}
