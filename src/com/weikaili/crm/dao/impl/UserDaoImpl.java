package com.weikaili.crm.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.weikaili.crm.dao.UserDao;
import com.weikaili.crm.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void save(User user){
		this.getHibernateTemplate().save(user);
	}

	@Override
	public User login(User user) {
		System.out.println(22222);
		List<User> list =(List<User>) this.getHibernateTemplate().find("from User where user_code=? and user_password = ?",user.getUser_code(),user.getUser_password());
		System.out.println(111111111);
		if(list.size() > 0)
			return list.get(0);
		return null;
	}
}
