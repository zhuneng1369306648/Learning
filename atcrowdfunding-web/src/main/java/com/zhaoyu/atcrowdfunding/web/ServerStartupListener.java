package com.zhaoyu.atcrowdfunding.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerStartupListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//将web应用路径（名称）保存到application范围中
		ServletContext application = sce.getServletContext();//这就是所谓的application应用范围

		String path = application.getContextPath();
		application.setAttribute("APP_PATH", path);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
