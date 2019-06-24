package com.zy.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.zy.jdbc.JDBCUtil;

public class TextDemo {
	@Test
	public void testTransaction() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			 conn = JDBCUtil.getConn();
			String sql = "select * from account";
			 ps = conn.prepareStatement(sql);
			 rs=ps.executeQuery();
		    while(rs.next()) {
		    	System.out.println(rs.getString("name")+"=="+rs.getInt("money"));
		    }
		     
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, ps,rs);
		}
		
	}

}
