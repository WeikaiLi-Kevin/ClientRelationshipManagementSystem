package com.weikaili.crm.service.impl;

import com.weikaili.crm.dao.CustomerDao;
import com.weikaili.crm.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
}
