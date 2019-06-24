package com.zy.store.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.store.domain.PageModel;
import com.zy.store.domain.Product;
import com.zy.store.service.ProductService;
import com.zy.store.service.serviceImp.ProductServiceImp;
import com.zy.store.web.base.BaseServlet;
public class ProductServlet extends BaseServlet {
	public String findProductByPid(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//获取商品pid
		String pid = request.getParameter("pid");
		//根据商品信息pid查询商品信息
		ProductService ProductService = new ProductServiceImp();
		Product product = ProductService.findProductByPid(pid);
		//将获取的商品放入request
		request.setAttribute("product", product);
		//转发到
		return "/jsp/product_info.jsp";
		
	}
	public String findProductsByCidWithPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cid = request.getParameter("cid");
		int curNum=Integer.parseInt(request.getParameter("num"));
		//调用业务层功能:以分页形式查询当前类别下商品信息
		//返回PageModel对象(1_当前页商品信息2_分页3_url)
		ProductService ProductService=new ProductServiceImp();
		PageModel pm=ProductService.findProductsByCidWithPage(cid,curNum);
		request.setAttribute("page", pm);
		
		return "/jsp/product_list.jsp";
		
	}

}
