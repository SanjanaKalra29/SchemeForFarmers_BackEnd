package com.lti.service;

import com.lti.entity.User;

public interface UserService {
	
	public void register(User user);

	User login(String email, String password);

}