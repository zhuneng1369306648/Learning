package com.zy.store.dao.daoImp;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zy.store.dao.UserDao;
import com.zy.store.domain.User;
import com.zy.store.utils.JDBCUtils;

public class UserDaoImp implements UserDao{

	@Override
	public void userRegist(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql ="INSERT INTO USER VALUES(?,?,?,?,?,?,?,?,?,?)";
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		Object[] params={user.getUid(),user.getUsername(),user.getPassword(),user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),user.getSex(),user.getState(),user.getCode()};
		qr.update(sql, params);
		/*QueryRunner：SQL语句的操作对象，可以设置查询结果集的封装策略，线程安全。
             构造方法：
            （1）QueryRunner()：创建一个与数据库无关的QueryRunner对象，后期再操作数据库的会后，需要手动给一个Connection对象，它可以手动控制事务。
                  Connection.setAutoCommit(false);     设置手动管理事务
                  Connection.commit();     提交事务

             （2）QueryRunner(DataSource ds)：创建一个与数据库关联的queryRunner对象，后期再操作数据库的时候，不需要Connection对象，自动管理事务。
                  DataSource：数据库连接池对象。*/

		
	}

	@Override
	public User userLogin(User user)throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from user where username=? and password=?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
	}

	@Override
	public void updateUser(User user) throws SQLException {
		String sql="update user set username=? , password=? ,name =? ,email=?, telephone =? ,birthday =? ,sex=? ,state=? ,code= ? where uid=?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		Object[] params={user.getUsername(),user.getPassword(),user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),user.getSex(),user.getState(),user.getCode(),user.getUid()};
		qr.update(sql,params);
		
	}

	@Override
	public User userActive(String code) throws SQLException {
		String sql = "select * from user where code=?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		User user=qr.query(sql, new BeanHandler<User>(User.class),code);
		return user;
		
	}

}
