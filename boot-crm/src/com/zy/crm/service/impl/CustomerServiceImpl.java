package com.zy.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.crm.mapper.CustomerMapper;
import com.zy.crm.pojo.Customer;
import com.zy.crm.pojo.QueryVo;
import com.zy.crm.service.CustomerService;
import com.zy.crm.utils.Page;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
		// TODO Auto-generated method stub
		vo.setStart((vo.getPage() - 1) * vo.getRows());
		
		//查询每页的数据列表
		List<Customer> list = customerMapper.getCustomerByQueryVo(vo);
		
		
		//查询总记录数
		Integer total = customerMapper.getCountByQueryVo(vo);
		
		//包装分页数据
		Page<Customer> page = new Page<Customer>(total, vo.getPage(), vo.getRows(), list);
		return page;
	}

	@Override
	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.getCustomerById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.updateCustomer(customer);
		
	}

	@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		customerMapper.deleteCustomer(id);
	}

}
