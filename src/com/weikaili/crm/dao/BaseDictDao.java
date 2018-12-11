package com.weikaili.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.weikaili.crm.domain.BaseDict;


public interface BaseDictDao {

	List<BaseDict> findByTypeCode(String dict_type_code);
	
	//数据字典列表查询
//	public List<BaseDict> findBaseDictList(DetachedCriteria detachedCriteria);

}
