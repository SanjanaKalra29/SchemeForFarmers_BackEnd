package com.lti.service;

import com.lti.entity.User;

public interface UserService {

	User login(String email, String password);

}