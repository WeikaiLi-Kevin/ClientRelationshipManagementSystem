package com.weikaili.crm.dao;

import com.weikaili.crm.domain.User;

public interface UserDao {
	public void save(User user);

	public User login(User user);
}
