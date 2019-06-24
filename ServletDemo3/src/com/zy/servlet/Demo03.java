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
			// 1. �������Զ���
			Properties properties = new Properties();
			
			//��ȡ��java�ļ���class ��Ȼ���ȡ���������class��������е��Ǹ������������
			
			/*
			 * ServletContext
			 * a·��--������tomcat�����Ŀ¼
			 * 			D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03
			 * 
			 * ClassLoader 
			 * 
			 * a·���� D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03\WEB-INF\classes
			 * 
			 * Ĭ�ϵ�lcassloader ��·�����������·�������Ǳ���ûص�Demo03���Ŀ¼�£����ܽ���fileĿ¼����λص���һ��Ŀ¼�أ�
			 *  ../../  ---  D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03
			 * ../../file/config.properties  --- D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03\file\config.properties

			 * b·���� D:\tomcat\apache-tomcat-7.0.52\apache-tomcat-7.0.52\wtpwebapps\Demo03\file\config.properties
			 */
//			System.out.println(getClass().getClassLoader());
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("../../file/config.properties");
			properties.load(is);
			// 3. ��ȡname���Ե�ֵ
			String name = properties.getProperty("name");
			System.out.println("name333333=" + name);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void test02() throws IOException {//����·��
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
