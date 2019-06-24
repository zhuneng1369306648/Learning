package com.zy.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.domain.PageBean;
import com.zy.service.StudentService;
import com.zy.service.impl.StudentServiceImpl;

public class StudentListPageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int currentPage = Integer.parseInt(request.getParameter("currentPage"));
			StudentService service = new StudentServiceImpl();
			PageBean pageBean = service.findStudentByPage(currentPage);
			request.setAttribute("pageBean", pageBean);
			request.getRequestDispatcher("list_page.jsp").forward(request, response);
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
