package com.zy.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.domain.Student;
import com.zy.service.StudentService;
import com.zy.service.impl.StudentServiceImpl;

public class UpdateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int sid = Integer.parseInt(request.getParameter("sid"));
			String sname = request.getParameter("sname"); // sname:zhangsan
			String gender = request.getParameter("gender");
			String phone = request.getParameter("phone");
			String birthday = request.getParameter("birthday"); // 1989-10-18
			String info = request.getParameter("info");
			// String hobby = request.getParameter("hobby");//hobby : 游泳，写字， 足球。
			String[] h = request.getParameterValues("hobby");
			String hobby = Arrays.toString(h);
			hobby = hobby.substring(1, hobby.length() - 1);
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
			Student student = new Student(sname, gender, phone, hobby, info, date);
			StudentService service = new StudentServiceImpl();
			service.update(student);
			request.getRequestDispatcher("StudentListServlet").forward(request, response);

		} catch (Exception e) {
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
