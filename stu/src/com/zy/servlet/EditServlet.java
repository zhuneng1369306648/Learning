package com.zy.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.domain.Student;
import com.zy.service.StudentService;
import com.zy.service.impl.StudentServiceImpl;

public class EditServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int sid = Integer.parseInt(request.getParameter("sid"));
			StudentService service = new StudentServiceImpl();
			Student stu;
			stu = service.findStudentById(sid);
			request.setAttribute("stu", stu);
			request.getRequestDispatcher("edit.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
