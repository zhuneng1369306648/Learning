package com.zy.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zy.jdbc.unit.JDBCUtil;

public class MainTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
		conn = JDBCUtil.getConn();
		st = conn.createStatement();
		String sql = "select * from stu";
		rs = st.executeQuery(sql);
		
			while(rs.next()) {
				String name =  rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(name+ " "+ age);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, st, rs);
		}
		
	}

}
