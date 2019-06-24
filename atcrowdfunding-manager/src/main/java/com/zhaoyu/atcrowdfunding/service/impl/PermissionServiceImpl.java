package com.zhaoyu.atcrowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaoyu.atcrowdfunding.bean.Permission;
import com.zhaoyu.atcrowdfunding.bean.User;
import com.zhaoyu.atcrowdfunding.dao.PermissionDao;
import com.zhaoyu.atcrowdfunding.service.PermissionService;


@Service
public class PermissionServiceImpl  implements PermissionService{

	@Autowired
	private PermissionDao permissionDao;

	@Override
	public Permission queryRootPermission() {
		// TODO Auto-generated method stub
		return permissionDao.queryRootPermission();
	}

	@Override
	public List<Permission> queryChildPermissions(Integer pid) {
		// TODO Auto-generated method stub
		return permissionDao.queryChildPermissions(pid);
	}

	@Override
	public List<Permission> queryAll() {
		// TODO Auto-generated method stub
		return permissionDao.queryAll();
	}

	@Override
	public void insertPermission(Permission permission) {
		// TODO Auto-generated method stub
		permissionDao.insertPermission(permission);
	}

	@Override
	public Permission queryById(Integer id) {
		// TODO Auto-generated method stub
		return permissionDao.queryById(id);
	}

	@Override
	public void updatePermission(Permission permission) {
		// TODO Auto-generated method stub
		permissionDao.updatePermission(permission);
	}

	@Override
	public void deletePermission(Permission permission) {
		// TODO Auto-generated method stub
		permissionDao.deletePermission(permission);
	}

	@Override
	public List<Integer> queryPermissionidsByRoleid(Integer roleid) {
		// TODO Auto-generated method stub
		return permissionDao.queryPermissionidsByRoleid(roleid);
	}

	@Override
	public List<Permission> queryPermissionsByUser(User dbUser) {
		// TODO Auto-generated method stub
		return permissionDao.queryPermissionsByUser(dbUser);
	}
}
