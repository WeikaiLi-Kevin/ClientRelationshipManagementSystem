package com.weikaili.crm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.weikaili.crm.dao.CustomerDao;
import com.weikaili.crm.domain.Customer;
import com.weikaili.crm.service.CustomerService;
@Transactional
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}
	
}
