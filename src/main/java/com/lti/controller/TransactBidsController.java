package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.exception.TransactServiceException;
import com.lti.service.TransactBidsService;
import com.lti.status.Status;

@RestController
@CrossOrigin
public class TransactBidsController {

	@Autowired
	private TransactBidsService tbserivce;

	@PostMapping("/winbids")
	public Status placebid() {
		try {
			tbserivce.getwinnerbids();
			Status status = new Status();
			status.setStatus(com.lti.status.Status.StatusType.SUCCESS);
			status.setMessage("Winner bidders announced");
			return status;

		} catch (TransactServiceException e) {

			Status status = new Status();
			status.setStatus(com.lti.status.Status.StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
	}
}
