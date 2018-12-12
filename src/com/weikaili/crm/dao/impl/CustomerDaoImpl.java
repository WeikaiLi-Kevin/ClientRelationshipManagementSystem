package com.weikaili.crm.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.weikaili.crm.dao.CustomerDao;
import com.weikaili.crm.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(customer);
	}

	@Override
	public Integer findCount(DetachedCriteria detachedCriteria) {
		// TODO Auto-generated method stub
		detachedCriteria.setProjection(Projections.rowCount());
		List<Long> list = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
		if(list.size()>0) {
			return list.get(0).intValue();
		}
		return null;
	}

	@Override
	public List<Customer> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize) {
		// TODO Auto-generated method stub
		detachedCriteria.setProjection(null);
		return (List<Customer>)this.getHibernateTemplate().findByCriteria(detachedCriteria,begin,pageSize);
	}

	@Override
	public Customer findById(Long cust_id) {
		
		return this.getHibernateTemplate().get(Customer.class, cust_id);
	}

	@Override
	public void delete(Customer customer) {
		this.getHibernateTemplate().delete(customer);
		}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(customer);
	}

}
