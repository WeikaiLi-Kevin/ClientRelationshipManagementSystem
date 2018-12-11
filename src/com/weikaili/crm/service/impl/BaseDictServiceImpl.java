package com.weikaili.crm.service.impl;

import java.util.List;

import com.weikaili.crm.dao.BaseDictDao;
import com.weikaili.crm.domain.BaseDict;
import com.weikaili.crm.service.BaseDictService;

public class BaseDictServiceImpl implements BaseDictService {

	 private BaseDictDao baseDictDao;

	public void setBaseDictDao(BaseDictDao baseDictDao) {
		this.baseDictDao = baseDictDao;
	}

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		// TODO Auto-generated method stub
		return baseDictDao.findByTypeCode(dict_type_code);
	}
}
