package com.zy.crm.mapper;

import java.util.List;

import com.zy.crm.pojo.Customer;
import com.zy.crm.pojo.QueryVo;
import com.zy.crm.utils.Page;

public interface CustomerMapper {
	//根据查询条件，分页查询用户列表
	List<Customer> getCustomerByQueryVo(QueryVo vo);
	
	//根据差啊讯条件查询总记录数
	Integer getCountByQueryVo(QueryVo vo);
	//根据ID查询用户信息
	Customer getCustomerById(Integer id);
	//更新用户信息
	void updateCustomer(Customer customer);
	
	//删除用户信息
	void deleteCustomer(Integer id);
}
