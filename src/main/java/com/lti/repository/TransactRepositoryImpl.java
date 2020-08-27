package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.TransactBids;

@Repository
public class TransactRepositoryImpl implements TransactRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void save(TransactBids bids) {
		entityManager.persist(bids);

	}
}
