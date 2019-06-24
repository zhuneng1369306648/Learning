package com.zy.store.service.serviceImp;

import java.sql.SQLException;

import com.zy.store.dao.UserDao;
import com.zy.store.domain.User;
import com.zy.store.service.UserService;
import com.zy.store.utils.BeanFactory;

public class UserServiceImp implements UserService{
	UserDao UserDao=(UserDao)BeanFactory.createObject("UserDao");

	@Override
	public void userRegist(User user) throws SQLException {
		UserDao UserDao=(UserDao)BeanFactory.createObject("UserDao");
		// TODO Auto-generated method stub
		//实现注册功能
		UserDao.userRegist(user);
		
	}

	@Override
	public boolean userActive(String code) throws SQLException {
		// TODO Auto-generated method stub
		User user = UserDao.userActive(code);
		if(null!=user) {
			//可以根据激活码查询到一个用户
			//修改用户的状态，清楚激活码
			user.setState(1);
			user.setCode(null);
			//对数据库执行一次真实的更新操作 update user set state=1,code=null
			//update user set username=?,password=?,name=?,email=?,telephone=?,birthday =? ,sex=? ,state=? ,code= ? where uid=?
		    UserDao.updateUser(user);
		    return true;
			
		}
		//不可以根据激活码查询到一个用户
		return false;
	}

	@Override
	public User userLogin(User user) throws SQLException {
		//此处:可以利用异常在模块之间传递数据
		
		
		
		//select * from user where username=? and password=?
		User uu=UserDao.userLogin(user);
		if(null==uu){
			throw new RuntimeException("密码有误!");
		}else if(uu.getState()==0){
			throw new RuntimeException("用户未激活!");
		}else{
			return uu;
		}
	}

}
