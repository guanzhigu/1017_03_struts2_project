package com.wst.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wst.domain.User;
import com.wst.service.UserService;
import com.wst.service.impl.UserServiceImpl;

public class LoginAtion extends ActionSupport implements ModelDriven<User> {
			
	private UserService userService = new UserServiceImpl();
	private User model = new User();
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
	
	public String login(){
		boolean flag = this.userService.login(this.getModel().getUsername(), this.getModel().getPassword());
		if(flag){
			return "home";	
		}else{
			this.addActionError("用户名或者密码错误");
			return "login";
		}
	}

	@Override 
	public void validate(){
		if("".equals(this.getModel().getUsername())){
			this.addFieldError("username", "用户名不能为空");
		}
		if("".equals(this.getModel().getPassword())){
			this.addFieldError("password", "密码不能为空");
		}
	}
}
