package com.lti.repository;

import java.util.List;

import com.lti.entity.Bid;

public interface BidRepository {

	List<Bid> findBidsByCropId(int id);

	void save(Bid bid);

	double maxbid(int id);

}