package com.nagarro.liquibaseDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.liquibaseDemo.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void addUser(User user) {
		userRepo.save(user);
	}
	
}
