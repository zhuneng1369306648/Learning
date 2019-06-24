package com.zhaoyu.atcrowdfunding.service;

import java.util.List;

import com.zhaoyu.atcrowdfunding.bean.Permission;
import com.zhaoyu.atcrowdfunding.bean.User;

public interface PermissionService {

	Permission queryRootPermission();

	List<Permission> queryChildPermissions(Integer pid);

	List<Permission> queryAll();

	void insertPermission(Permission permission);

	Permission queryById(Integer id);

	void updatePermission(Permission permission);

	void deletePermission(Permission permission);

	List<Integer> queryPermissionidsByRoleid(Integer roleid);

	List<Permission> queryPermissionsByUser(User dbUser);

}
