package com.example.mvcdemo.login.service;

import com.example.mvcdemo.login.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
