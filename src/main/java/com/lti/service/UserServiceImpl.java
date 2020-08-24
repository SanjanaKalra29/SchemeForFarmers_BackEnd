package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;


import com.lti.entity.User;

import com.lti.exception.UserServiceException;

import com.lti.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void register(User user) {
		if(userRepo.isUserAvailable(user.getEmail())) {
			userRepo.save(user);
		}
		else
			throw new UserServiceException("User Already register");
		
	}
	
	@Override
	public User login(String email, String password) {
		try {
			if (!userRepo.isUserAvailable(email)) {
				throw new UserServiceException("User not registered");
			}
			int id = userRepo.findByEmailAndPass(email, password);
			System.out.println(id);
			User user = userRepo.findbyId(id);
			return user;
		} catch (EmptyResultDataAccessException e) {
			throw new UserServiceException("Incorrect Email/Password");
		}
	}

	
}
