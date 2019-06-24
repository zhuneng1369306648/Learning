package com.zy.crm.service;

import java.util.List;

import com.zy.crm.pojo.BaseDict;

public interface BaseDictService {

	List<BaseDict> getBaseDictByCode(String customer_from_type);

}
