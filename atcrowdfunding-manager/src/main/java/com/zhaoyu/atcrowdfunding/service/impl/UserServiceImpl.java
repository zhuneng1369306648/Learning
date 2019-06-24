package com.zhaoyu.atcrowdfunding.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaoyu.atcrowdfunding.bean.User;
import com.zhaoyu.atcrowdfunding.dao.UserDao;
import com.zhaoyu.atcrowdfunding.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> queryAll() {
		
		return userDao.queryAll();
	}

	@Override
	public User query4Login(User user) {
		// TODO Auto-generated method stub
		return userDao.query4Login(user);
	}

	@Override
	public List<User> pageQueryData(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.pageQueryData(map);
	}

	@Override
	public int pageQueryCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.pageQuaryCount(map);
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userDao.insertUser(user);
		
	}

	@Override
	public User queryById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.queryById(id);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userDao.deleteUserById(id);
	}

	@Override
	public void deleteUsers(Map<String, Object> map) {
		// TODO Auto-generated method stub
		userDao.deleteUsers(map);
	}

	@Override
	public void deleteUserRoles(Map<String, Object> map) {
		// TODO Auto-generated method stub
		userDao.deleteUserRoles(map);
	}

	@Override
	public void insertUserRoles(Map<String, Object> map) {
		// TODO Auto-generated method stub
		userDao.insertUserRoles(map);
	}

	@Override
	public List<Integer> queryRoleidsByUserid(Integer id) {
		// TODO Auto-generated method stub
		 return userDao.queryRoleidsByUserid(id);
	}
}
