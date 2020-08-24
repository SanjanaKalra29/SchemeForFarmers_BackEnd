package com.lti.repository;

import com.lti.entity.User;

public interface UserRepository {

	int findByEmailAndPass(String email, String pass);

	User findbyId(int id);

	boolean isUserAvailable(String email);

}
