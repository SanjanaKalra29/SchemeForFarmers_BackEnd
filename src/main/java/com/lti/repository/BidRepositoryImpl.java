package com.lti.repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Bid;

@Repository
public class BidRepositoryImpl implements BidRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Bid> findBidsByCropId(int id) {

		List<Bid> bids = entityManager.createQuery("select b from Bid b where b.crop.id = :cid").setParameter("cid", id)
				.getResultList();
		return bids;
	}

	@Override
	@Transactional
	public void save(Bid bid) {
		entityManager.persist(bid);

	}

	@Override
	@Transactional
	public double maxbid(int id) {
		return (double) entityManager.createQuery("select COALESCE(MAX(b.amount),0) from Bid b where b.crop.id = :cid")
				.setParameter("cid", id).getSingleResult();
	}
}
