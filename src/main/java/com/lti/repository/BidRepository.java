package com.lti.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Bid;

public interface BidRepository {

	List<Bid> findBidsByCropId(int id);

}