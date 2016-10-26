package com.wst.dao;

import java.io.Serializable;
import java.util.List;

import com.wst.domain.User;

public interface UserDao {
	public User getUserByUAndP(String username, String password);
	public List<User> getAllUser();
	public User getUserById(Serializable uid);
	public void deleteUser(Serializable uid);
	public void updateUser(User user);
	public void saveUser(User user);
}
