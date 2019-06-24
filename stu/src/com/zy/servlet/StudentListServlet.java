package com.zy.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.zy.dao.StudentDao;
import com.zy.dao.impl.StudentDaoImpl;
import com.zy.domain.Student;
import com.zy.service.StudentService;
import com.zy.service.impl.StudentServiceImpl;

public class StudentListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	
	try {
		
		StudentService service = new StudentServiceImpl();
		List<Student> list = service.findAll(); 
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
