package com.thomastaguchi.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomastaguchi.workshopmongo.domain.User;
import com.thomastaguchi.workshopmongo.repoditory.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll()	{
		return repo.findAll();
	}
}
