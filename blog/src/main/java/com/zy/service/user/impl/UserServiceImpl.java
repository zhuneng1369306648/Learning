package com.zy.service.user.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zy.constant.ErrorConstant;
import com.zy.dao.UserDao;
import com.zy.exception.BusinessException;
import com.zy.model.UserDomain;
import com.zy.service.user.UserService;
import com.zy.utils.TaleUtils;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public UserDomain login(String username, String password) {
		// TODO Auto-generated method stub
		if(StringUtils.isBlank(username) || StringUtils.isBlank(password))
			throw BusinessException.withErrorCode(ErrorConstant.Auth.USERNAME_PASSWORD_IS_EMPTY);
		String pwd = TaleUtils.MD5encode(username + password);
		UserDomain user = userDao.getUserInfoByCond(username,pwd);
		if(null == user)
			throw BusinessException.withErrorCode(ErrorConstant.Auth.USERNAME_PASSWORD_ERROR);
        return user;
    }

	@Override
	public UserDomain getUserInfoById(Integer uid) {
		// TODO Auto-generated method stub
		return userDao.getUserInfoById(uid);
	}

	// 开启事务
    @Transactional
    @Override
    public int updateUserInfo(UserDomain user) {
        if (null == user.getUid())
            throw BusinessException.withErrorCode("用户编号不能为空");
        return userDao.updateUserInfo(user);
    }
 /*   @Transactional之propagation

    Propagation支持7种不同的传播机制：

   REQUIRED

             业务方法需要在一个事务中运行,如果方法运行时,已处在一个事务中,那么就加入该事务,否则自己创建一个新的事务.
             这是spring默认的传播行为.。 

   SUPPORTS：  

             如果业务方法在某个事务范围内被调用,则方法成为该事务的一部分,如果业务方法在事务范围外被调用,则方法在没有事务
             的环境下执行。

   MANDATORY：

             只能在一个已存在事务中执行,业务方法不能发起自己的事务,如果业务方法在没有事务的环境下调用,就抛异常

   REQUIRES_NEW

           业务方法总是会为自己发起一个新的事务,如果方法已运行在一个事务中,则原有事务被挂起,新的事务被创建,直到方法结束
           ,新事务才结束,原先的事务才会恢复执行.

   NOT_SUPPORTED

         声明方法需要事务,如果方法没有关联到一个事务,容器不会为它开启事务.如果方法在一个事务中被调用,该事务会被挂起,
         在方法调用结束后,原先的事务便会恢复执行.

  NEVER：

            声明方法绝对不能在事务范围内执行,如果方法在某个事务范围内执行,容器就抛异常.只有没关联到事务,才正常执行.

   NESTED：*/

}

