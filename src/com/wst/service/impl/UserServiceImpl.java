package com.wst.service.impl;

import java.io.Serializable;
import java.util.List;

import com.wst.dao.UserDao;
import com.wst.dao.impl.UserDaoImpl;
import com.wst.domain.User;
import com.wst.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		User user = this.userDao.getUserByUAndP(username, password);
		if(user==null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.userDao.getAllUser();
	}

	@Override
	public User getUserById(Serializable uid) {
		// TODO Auto-generated method stub
		return this.userDao.getUserById(uid);
	}

	@Override
	public void deleteUser(Serializable uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateUser(user);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.saveUser(user);
	}

}
