package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public Boolean isUserAlreadyPresent(User user);
}
