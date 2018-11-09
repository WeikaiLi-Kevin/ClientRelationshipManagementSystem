package com.weikaili.crm.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.weikaili.crm.domain.User;
import com.weikaili.crm.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	// inject Service
	private UserService userService;
	
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	public String regist(){
		userService.regist(user);
		return LOGIN;
	}
}
