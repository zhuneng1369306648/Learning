package com.zy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo02 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
	    if(cookies != null) {
	    	for(Cookie cookie : cookies) {
	    		System.out.println(cookie.getName()+" += "+cookie.getValue());
	    	}
	    }
	    Cookie cookie = new Cookie("name","zhangsan");
	    cookie.setMaxAge(60*60*24);
	    cookie.setDomain(".zy.com");
	    cookie.setPath("/CookieDemo");
	    response.addCookie(cookie);
	    Cookie cookie2 = new Cookie("age","18");
	    response.addCookie(cookie2);
	    response.getWriter().write("hello Cookie...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
