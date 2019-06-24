package com.zy.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo03 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//test01();
		test02();
		//test03();
		

	}
	private void test03() {
		try {
			// 1. 创建属性对象
			Properties properties = new Properties();
			
			//获取该java文件的class ，然后获取到加载这个class到虚拟机中的那个类加载器对象。
			
			/*
			 * ServletContext
			 * a路径--工程在tomcat里面的目录
			 * 			D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03
			 * 
			 * ClassLoader 
			 * 
			 * a路径： D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03\WEB-INF\classes
			 * 
			 * 默认的lcassloader 的路径是上面这个路径，我们必须得回到Demo03这个目录下，才能进入file目录。如何回到上一级目录呢？
			 *  ../../  ---  D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03
			 * ../../file/config.properties  --- D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03\file\config.properties

			 * b路径： D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03\file\config.properties
			 */
//			System.out.println(getClass().getClassLoader());
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("../../file/config.properties");
			properties.load(is);
			// 3. 获取name属性的值
			String name = properties.getProperty("name");
			System.out.println("name333333=" + name);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void test02() throws IOException {//相對路徑
		ServletContext context = getServletContext();
		Properties properties = new Properties();
		InputStream is = context.getResourceAsStream("file/config.properties");
		properties.load(is);
		String name = properties.getProperty("name");
		System.out.println("name22=="+name);
		is.close();
	}
	private void test01() throws IOException {
		ServletContext context = getServletContext();
		String path = context.getRealPath("file/config.properties");
		System.out.println("path="+path);
		Properties properties = new Properties();
		InputStream is = new FileInputStream(path);
		properties.load(is);
		String name = properties.getProperty("name");
		System.out.println("name="+name);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
