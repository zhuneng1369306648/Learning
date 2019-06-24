package com.zy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.util.CookieUtil;
public class demo01 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String id = request.getParameter("id");
	    Cookie[] cookies = request.getCookies();
	    Cookie cookie = CookieUtil.findCookie(cookies, "history");
	    if(cookie==null) {
	    	Cookie cook = new Cookie("history",id);
	    	cook.setMaxAge(60*60*24*7);
	    	response.addCookie(cook);
	    }
	    else {
	    	String id2 = cookie.getValue();
	    	cookie.setValue(id+"#"+id2);
	    	cookie.setMaxAge(60*60*24*7);
	    	response.addCookie(cookie);
	    }
	    response.sendRedirect("product_info.htm");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
