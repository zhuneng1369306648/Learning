package com.zy.crm.service;

import com.zy.crm.pojo.Customer;
import com.zy.crm.pojo.QueryVo;
import com.zy.crm.utils.Page;

public interface CustomerService {

	//分页查询条件，分页查询用户列表
		Page<Customer> getCustomerByQueryVo(QueryVo vo);
		//根据ID查询用户信息
		Customer getCustomerById(Integer id);
		//更新用户信息
		void updateCustomer(Customer customer);
		//删除用户信息
		void deleteCustomer(Integer id);

		

}
