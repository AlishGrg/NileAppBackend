package com.app.nile.service;

import java.util.List;

import com.app.nile.model.User;

public interface SignUpService {
	public boolean addUser(User user);
	public boolean UpdateUser(User user);
	public boolean deleteUser(Long Id);
	public List<User> showUsers();
}
