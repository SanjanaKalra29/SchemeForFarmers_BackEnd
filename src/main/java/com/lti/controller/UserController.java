package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.controller.UserController.Status.StatusType;
import com.lti.dto.LoginDto;
import com.lti.dto.RegisterDto;
import com.lti.entity.User;
import com.lti.exception.UserServiceException;
import com.lti.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/register")
	public Status register(@RequestBody RegisterDto regdto) {
		try {
			System.out.println(regdto.getUser().getFullname());
			System.out.println(regdto.getAddress().getAddressLine1());
			// System.out.println(regdto.getLanddetails().getArea());
			if (userService.register(regdto)) {
				Status status = new Status();
				status.setStatus(StatusType.SUCCESS);
				status.setMessage("Registration Successful");
				return status;
			} else {
				throw new UserServiceException("Registration Unsucessful");
			}
		} catch (UserServiceException e) {
			Status status = new Status();
			status.setStatus(StatusType.FAILURE);
			status.setMessage(e.getMessage());
			return status;
		}
	}

	@PostMapping("/login")
	public LoginStatus login(@RequestBody LoginDto logindto) {

		try {
			System.out.println(logindto.getEmail());
			User user = userService.login(logindto.getEmail(), logindto.getPassword());

			// request.getSession().setAttribute("Userid", user.getId());

			LoginStatus loginstatus = new LoginStatus();
			loginstatus.setStatus(StatusType.SUCCESS);
			loginstatus.setMessage("Login Sucessful");
			loginstatus.setUserId(user.getId());
			loginstatus.setName(user.getFullname());
			return loginstatus;

		} catch (UserServiceException e) {

			LoginStatus loginstatus = new LoginStatus();
			loginstatus.setStatus(StatusType.FAILURE);
			loginstatus.setMessage(e.getMessage());
			return loginstatus;
		}
	}

	public static class LoginStatus extends Status {
		private int UserId;
		private String name;

		public int getUserId() {
			return UserId;
		}

		public void setUserId(int UserId) {
			this.UserId = UserId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
