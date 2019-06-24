package com.zy.service;

import com.zy.domain.User;

public interface UserService extends IService<User>{
	User findByName(String userName);
	
	void saveUser(User user);
}
