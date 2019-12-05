package com.nagarro.liquibaseDemo.service;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.liquibaseDemo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
