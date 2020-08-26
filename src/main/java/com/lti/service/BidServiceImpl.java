package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import com.lti.dto.bidsDto;
import com.lti.entity.Bid;
import com.lti.exception.CropServiceException;
import com.lti.repository.BidRepository;

public class BidServiceImpl implements BidService {
	@Autowired
	private BidRepository bidrepo;

	@Override
	public List<bidsDto> getBids(int id) {
		try {

			List<Bid> bids = bidrepo.findBidsByCropId(id);

			List<bidsDto> sbids = new ArrayList<bidsDto>();

			for (Bid bid : bids) {
				bidsDto bdto = new bidsDto();
				bdto.setCropid(bid.getCrop().getId());
//				bdto.setFarmerid(bid.getCrop().getUser().get);
			}

			return sbids;
		} catch (EmptyResultDataAccessException e) {
			throw new CropServiceException("No crops available");
		}
	}
}
