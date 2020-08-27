package com.lti.repository;

import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.TransactBids;

public interface TransactRepository {

	void save(TransactBids bids);

}