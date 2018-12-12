package com.weikaili.crm.service;

import org.hibernate.criterion.DetachedCriteria;

import com.weikaili.crm.domain.Customer;
import com.weikaili.crm.domain.PageBean;

public interface CustomerService {

	void save(Customer customer);

	PageBean<Customer> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);

	Customer findById(Long cust_id);

	void delete(Customer customer);

	void update(Customer customer);

}
