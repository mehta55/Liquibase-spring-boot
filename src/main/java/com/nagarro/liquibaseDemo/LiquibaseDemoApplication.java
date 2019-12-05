package com.nagarro.liquibaseDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nagarro.liquibaseDemo.model.User;
import com.nagarro.liquibaseDemo.service.UserService;

@SpringBootApplication
public class LiquibaseDemoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseDemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		userService.addUser(new User(2, "mehta", "java", "123", "New Delhi"));
	}

}
