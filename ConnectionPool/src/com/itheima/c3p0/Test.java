package com.itheima.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

import com.itheima.uitl.JDBCUtil;
import com.itheima.uitl.JDBCUtil02;

public class Test {

	public static void main(String[] args) {
		
		try {
			Connection conn = JDBCUtil02.getConn();
			
			
			conn.prepareStatement(null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
