package com.lti.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BidController {
//
//	@Autowired
//	private BidsService bidsservice;
//
//	@RequestMapping(value = { "/bids", "/bids/{cropid}" })
//	public bidsDto getArticle(@PathVariable(name = "id") Integer cropid) {
//		try {
//			cropService.register(cropdto);
//			Status status = new Status();
//			status.setStatus(com.lti.status.Status.StatusType.SUCCESS);
//			status.setMessage("Bids Available");
//			return status;
//		} catch (CropServiceException e) {
//
//			Status status = new Status();
//			status.setStatus(com.lti.status.Status.StatusType.FAILURE);
//			status.setMessage(e.getMessage());
//			return status;
//
//		}
//	}
}
