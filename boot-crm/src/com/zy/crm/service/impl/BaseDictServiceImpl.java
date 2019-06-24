package com.zy.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.crm.mapper.BaseDictMapper;
import com.zy.crm.pojo.BaseDict;
import com.zy.crm.service.BaseDictService;


@Service
public class BaseDictServiceImpl  implements BaseDictService{
	
	@Autowired
	private BaseDictMapper baseDictMapper;

	@Override
	public List<BaseDict> getBaseDictByCode(String code) {
		// TODO Auto-generated method stub
		return baseDictMapper.getBaseDictByCode(code);
	}

}
