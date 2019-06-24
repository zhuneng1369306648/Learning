package com.zy.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zy.dao.UserDao;
import com.zy.domain.UserBean;
import com.zy.util.JDBCUtil02;

public class UserDaoImpl implements UserDao{

	@Override
	public UserBean login(UserBean user) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
		String sql = "selwct * from t_user where username = ? and password = ?";
		return runner.query(sql, new BeanHandler<UserBean>(UserBean.class),user.getUsername() , user.getPassword());
		
	}

}
