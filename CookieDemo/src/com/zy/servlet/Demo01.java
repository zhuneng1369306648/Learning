package com.zy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=utf-8");
	    Cookie cookie = new Cookie("aa","bb");
        response.addCookie(cookie);
        response.getWriter().write("请求成功");
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
        	for(Cookie c: cookies) {
        		String cookieName = c.getName();
        		String cookieValue = c.getValue();
        		System.out.println(cookieName+" = "+cookieValue);
        		
        	}
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
