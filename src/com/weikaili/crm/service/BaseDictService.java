package com.weikaili.crm.service;

import java.util.List;

import com.weikaili.crm.domain.BaseDict;

/**
 * for dictionary
 * @author Li Weikai
 *
 */
public interface BaseDictService {

	List<BaseDict> findByTypeCode(String dict_type_code);

}
