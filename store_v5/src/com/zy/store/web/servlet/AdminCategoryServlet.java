package com.zy.store.web.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.store.domain.Category;
import com.zy.store.service.CategoryService;
import com.zy.store.service.serviceImp.CategoryServiceImp;
import com.zy.store.utils.UUIDUtils;
import com.zy.store.web.base.BaseServlet;

public class AdminCategoryServlet extends BaseServlet {
	//findAllCats
		public String findAllCats(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//获取全部分类信息
			CategoryService CategoryService=new CategoryServiceImp();
			List<Category> list=CategoryService.getAllCats();
			//全部分类信息放入request
			req.setAttribute("allCats", list);
			return "/admin/category/list.jsp";
		}

		//addCategoryUI
		public String addCategoryUI(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			return "/admin/category/add.jsp";
		}
		//addCategory
		public String addCategory(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//获取分类名称
			String cname=req.getParameter("cname");
			String id=UUIDUtils.getId();
			Category c = new Category();
			c.setCid(id);
			c.setCname(cname);
			//调用业务层添加分类功能
			CategoryService CategoryService=new CategoryServiceImp();
			CategoryService.addCategory(c);
			resp.sendRedirect("/store_v5/AdminCategoryServlet?method=findAllcats");
			return null;
		}
			
			
			
}
