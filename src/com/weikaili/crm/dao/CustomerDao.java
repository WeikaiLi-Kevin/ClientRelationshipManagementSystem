package com.weikaili.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.weikaili.crm.domain.Customer;

public interface CustomerDao {

	void save(Customer customer);

	Integer findCount(DetachedCriteria detachedCriteria);

	List<Customer> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize);

	Customer findById(Long cust_id);

	void delete(Customer customer);

	void update(Customer customer);

}
