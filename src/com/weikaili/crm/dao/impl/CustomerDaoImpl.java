package com.weikaili.crm.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.weikaili.crm.dao.CustomerDao;
import com.weikaili.crm.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);
	}

}
