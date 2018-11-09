package com.weikaili.crm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.weikaili.crm.dao.UserDao;
import com.weikaili.crm.domain.User;
import com.weikaili.crm.service.UserService;
import com.weikaili.crm.utils.MD5Utils;
@Transactional
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void regist(User user){
		user.setUser_password(MD5Utils.md5(user.getUser_password()));
		user.setUser_state("1");
		userDao.save(user);
	}
}
