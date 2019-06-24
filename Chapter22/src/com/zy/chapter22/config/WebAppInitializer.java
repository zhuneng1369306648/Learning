package com.zy.chapter22.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	//Spring IOC 环境配置
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {RootConfig.class};
	}
    //DispatcherServlet配置
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {WebConfig.class};
	}
     
	
	
	//Dispatchservlet拦截配置
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"*.do"};
	}
	
	protected void customizeRegistration(Dynamic dynamic) {
		
		
		String filepath = "G:/mvc/uploads";
		
		Long singleMax = (long)(5*Math.pow(2, 20));
		Long totalMax = (long)(10*Math.pow(2, 20));
		dynamic.setMultipartConfig(new MultipartConfigElement(filepath,singleMax,totalMax,0));
		}

}
