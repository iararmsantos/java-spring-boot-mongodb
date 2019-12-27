package com.iarasantos.mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iarasantos.mongodb.domain.User;
import com.iarasantos.mongodb.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
