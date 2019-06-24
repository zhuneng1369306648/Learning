package com.zhaoyu.atcrowdfunding.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaoyu.atcrowdfunding.bean.Role;
import com.zhaoyu.atcrowdfunding.dao.RoleDao;
import com.zhaoyu.atcrowdfunding.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;


	public List<Role> pageQueryData(Map<String, Object> map) {
		return roleDao.pageQueryData(map);
	}

	public int pageQueryCount(Map<String, Object> map) {
		return roleDao.pageQueryCount(map);
	}

	public List<Role> queryAll() {
		return roleDao.queryAll();
	}

	public void insertRolePermission(Map<String, Object> paramMap) {
		roleDao.deleteRolePermissions(paramMap);
		roleDao.insertRolePermission(paramMap);
	}

}
