package com.zy.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.util.CookieUtil;

public class Demo03 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("admin".equals(userName) && "123".equals(password)){
			//获取cookie last-name --- >
			Cookie [] cookies = request.getCookies();
			
			//从数组里面找出我们想要的cookie
			Cookie cookie = CookieUtil.findCookie(cookies, "last");
			
			//是第一次登录，没有cookie
			if(cookie == null){
				
				Cookie c = new Cookie("last", System.currentTimeMillis()+"");
				c.setMaxAge(60*60); //一个小时
				response.addCookie(c);
				
				response.getWriter().write("欢迎您, "+userName);
				
			}else{
				//1. 去以前的cookie第二次登录，有cookie
				long lastVisitTime = Long.parseLong(cookie.getValue());
				
				//2. 输出到界面，
				response.getWriter().write("欢迎您, "+userName +",上次来访时间是："+new Date(lastVisitTime));
				
				
				//3. 重置登录的时间
				cookie.setValue(System.currentTimeMillis()+"");
				response.addCookie(cookie);
			}
		}else{
			response.getWriter().write("登陆失败 ");
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
