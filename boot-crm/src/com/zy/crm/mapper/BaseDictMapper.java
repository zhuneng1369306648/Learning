package com.zy.crm.mapper;

import java.util.List;

import com.zy.crm.pojo.BaseDict;

public  interface BaseDictMapper {
	List<BaseDict> getBaseDictByCode(String code);

}
