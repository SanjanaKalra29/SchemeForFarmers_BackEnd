package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lti.entity.Crop;
import com.lti.entity.TransactBids;
import com.lti.entity.User;
import com.lti.exception.TransactServiceException;
import com.lti.repository.BidRepository;
import com.lti.repository.CropRepository;
import com.lti.repository.TransactRepository;
import com.lti.repository.UserRepository;

@Service
public class TransactBidServiceImpl implements TransactBidsService {

	@Autowired
	private CropRepository cropRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BidRepository bidrepo;
	@Autowired
	private TransactRepository transactrepo;

	@Override
	public void getwinnerbids() {
		try {
			List<Crop> expiredcrops = cropRepo.findExpiredCrops();
			if (expiredcrops.isEmpty()) {
				throw new TransactServiceException("Bidders are still bidding");
			}
			for (Crop crop : expiredcrops) {
				double bidamount = bidrepo.maxbid(crop.getId());
				if (bidamount == 0) {
					crop.setStatus("Unsold");
					cropRepo.save(crop);
				} else {
					User winnerbidder = bidrepo.findBidderbyBidid(crop.getId(), bidamount);
					crop.setStatus("Sold");
					cropRepo.save(crop);
					TransactBids bids = new TransactBids();
					bids.setCrop(crop);
					bids.setUser(winnerbidder);
					bids.setAmount(bidamount);
					transactrepo.save(bids);
				}
			}
		} catch (EmptyResultDataAccessException e) {
			throw new TransactServiceException("You are not allowed to add Crop");
		}

	}
}
