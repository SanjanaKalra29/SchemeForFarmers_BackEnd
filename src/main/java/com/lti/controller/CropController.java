package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.controller.CropController.Status.StatusType;
import com.lti.entity.Crop;
import com.lti.exception.UserServiceException;
import com.lti.service.CropService;

@RestController
@CrossOrigin
public class CropController {

	@Autowired
	private CropService cropService;

	@PostMapping(path = "/cropregister")
	public Status register(@RequestBody Crop crop) {
		try {
			cropService.register(crop);
			Status status = new Status();
			status.setStatus(StatusType.SUCCESS);
			status.setMessage("Registration Successful");
			return status;
		} catch (UserServiceException e) {
			cropService.register(crop);
			Status status = new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;

		}
	}

	public static class Status {
		private StatusType Status;
		private String Message;

		public StatusType getStatus() {
			return Status;
		}

		public void setStatus(StatusType status) {
			Status = status;
		}

		public String getMessage() {
			return Message;
		}

		public void setMessage(String message) {
			Message = message;
		}

		public static enum StatusType {
			SUCCESS, FAILURE;
		}
	}
}
