package com.wst.service;

import java.io.Serializable;
import java.util.List;

import com.wst.domain.User;

public interface UserService {
	public boolean login(String username, String password);
	public List<User> getAllUser();
	public User getUserById(Serializable uid);
	public void deleteUser(Serializable uid);
	public void updateUser(User user);
	public void saveUser(User user);
}
