package com.lti.repository;

import org.springframework.stereotype.Repository;

import com.lti.entity.User;

public interface UserRepository {
	
	void save(User u);

	int findByEmailAndPass(String email, String pass);

	User findbyId(int id);

	boolean isUserAvailable(String email);

}



