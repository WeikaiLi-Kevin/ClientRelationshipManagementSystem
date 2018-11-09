package com.weikaili.crm.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.weikaili.crm.dao.UserDao;
import com.weikaili.crm.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void save(User user){
		this.getHibernateTemplate().save(user);
	}
}
