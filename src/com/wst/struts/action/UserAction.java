package com.wst.struts.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wst.domain.Education;
import com.wst.domain.Hobby;
import com.wst.domain.User;
import com.wst.service.UserService;
import com.wst.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private UserService userService = new UserServiceImpl();
	private User model = new User();
	private Long[] hids;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public Long[] getHids() {
		return hids;
	}
	public void setHids(Long[] hids) {
		this.hids = hids;
	}
	public void setModel(User model) {
		this.model = model;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
	public String showAllUser(){
		List<User> userList = this.userService.getAllUser();
		ActionContext.getContext().put("userList", userList);
		return "list";
	}
	public String updateUI(){
		List<Education> educations = new ArrayList<Education>();
		Education education1 = new Education();
		education1.setEid(1L);
		education1.setName("博士");
		Education education2 = new Education();
		education2.setEid(2L);
		education2.setName("烈士");
		Education education3 = new Education();
		education3.setEid(3L);
		education3.setName("幼儿园");
		
		educations.add(education1);
		educations.add(education2);
		educations.add(education3);
		
		ActionContext.getContext().put("educations", educations);
		
		List<Hobby> hobbies = new ArrayList<Hobby>();
		
		Hobby hobby1 = new Hobby();
		hobby1.setHid(1L);
		hobby1.setName("看电影");
		Hobby hobby2 = new Hobby();
		hobby2.setHid(2L);
		hobby2.setName("睡觉");
		Hobby hobby3 = new Hobby();
		hobby3.setHid(3L);
		hobby3.setName("打篮球");
		
		hobbies.add(hobby1);
		hobbies.add(hobby2);
		hobbies.add(hobby3);
		
		ActionContext.getContext().put("hobbies", hobbies);
		
		User user = this.userService.getUserById(this.getModel().getUserID());
		ActionContext.getContext().getValueStack().push(user);
		
		String[] strings = user.getInterest().split(",");
		this.hids = new Long[strings.length];
		int index = 0;
		for(String s:strings){
			this.hids[index] = Long.parseLong(s);
			index++;
		}
		return "updateUI";
	}
	
	public String update(){
		String temp = "";
		for(int i=0; i<this.hids.length; i++){
			if(i<this.hids.length-1){
				temp=temp+this.hids[i]+",";
			}else{
				temp = temp+this.hids[i];
			}
		}
		this.getModel().setInterest(temp);
		this.userService.updateUser(this.getModel());
		return null;
		
	}
}
