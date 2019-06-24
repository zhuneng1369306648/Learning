package com.zhaoyu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhaoyu.annotation.Controller;
import com.zhaoyu.annotation.Quatifier;
import com.zhaoyu.annotation.RequestMapping;
import com.zhaoyu.service.MyService;
import com.zhaoyu.service.impl.SpringmvcServiceImpl;

@Controller("zhaoyu")
public class SpringmvcController {
	
	@Quatifier("MyServiceImpl")
	MyService myService;
    @Quatifier("SpringmvcServiceImpl")
    SpringmvcServiceImpl smService;
	@RequestMapping("insert")
	public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
		myService.insert(null);
		smService.insert(null);
		return null;
	}
 
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
		myService.delete(null);
		smService.delete(null);
		return null;
	}
 
	@RequestMapping("update")
	public String update(HttpServletRequest request, HttpServletResponse response, String param) {
		myService.update(null);
		smService.update(null);
		return null;
	}
 
	@RequestMapping("select")
	public String select(HttpServletRequest request, HttpServletResponse response, String param) {
		myService.select(null);
		smService.select(null);
		return null;
	}
}
