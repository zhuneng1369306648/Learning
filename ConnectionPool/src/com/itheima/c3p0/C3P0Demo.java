package com.itheima.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import com.itheima.uitl.JDBCUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Demo {

	@Test
	public void testC3P0 (){
		
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//1. 创建datasource
//			ComboPooledDataSource dataSource = new ComboPooledDataSource("oracle");
			
			//默认会找 xml 中的 default-config 分支。 
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			System.out.println(dataSource.hashCode() );
			ComboPooledDataSource dataSource2 = new ComboPooledDataSource();
			System.out.println(dataSource2.hashCode()+"-------");
			//2. 设置连接数据的信息
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			
			//忘记了---> 去以前的代码 ---> jdbc的文档
			dataSource.setJdbcUrl("jdbc:mysql://localhost/bank");
			dataSource.setUser("root");
			dataSource.setPassword("root");
			
			//2. 得到连接对象
			conn = dataSource.getConnection();
			String sql = "insert into account values(null , ? , ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "admi234n");
			ps.setInt(2, 103200);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, ps);
		}
	}
}
