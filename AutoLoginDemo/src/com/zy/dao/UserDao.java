package com.zy.dao;

import java.sql.SQLException;

import com.zy.domain.UserBean;

public interface UserDao {
	UserBean login(UserBean user) throws SQLException;

}
