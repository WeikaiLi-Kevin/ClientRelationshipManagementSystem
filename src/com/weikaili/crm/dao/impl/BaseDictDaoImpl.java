package com.weikaili.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.weikaili.crm.dao.BaseDictDao;
import com.weikaili.crm.domain.BaseDict;

public class BaseDictDaoImpl extends HibernateDaoSupport implements BaseDictDao  {

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		// TODO Auto-generated method stub
		
		return (List<BaseDict>) this.getHibernateTemplate().find("from BaseDict where dict_type_code = ?", dict_type_code);
	}

//	@Override
//	public List<BaseDict> findBaseDictList(DetachedCriteria detachedCriteria) {
//		Session session = HibernateUtil.openSession();
//		//离线criteria与session绑定生成可执行criteria
//		Criteria criteria = detachedCriteria.getExecutableCriteria(session);
//		//使用二级缓存
//		criteria.setCacheable(true);
//		List list = criteria.list();
//		return list;
//	}

}
