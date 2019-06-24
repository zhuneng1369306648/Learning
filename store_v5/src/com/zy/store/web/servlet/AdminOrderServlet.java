package com.zy.store.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.store.domain.Order;
import com.zy.store.service.OrderService;
import com.zy.store.service.serviceImp.OrderServiceImp;
import com.zy.store.web.base.BaseServlet;

import net.sf.json.JSONArray;

public class AdminOrderServlet extends BaseServlet {
	public String findOrders(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		OrderService OrderService=new OrderServiceImp();
		String st=req.getParameter("state");
		List<Order> list=null;
		if(null==st||"".equals(st)) {
			list=OrderService.findAllOrders();
			//获取到全部订单
		}else {
			list=OrderService.findAllOrders(st);
		}
		//将订单全部放入request中
		req.setAttribute("allOrders", list);
		//转发
		
			return "/admin/order/list.jsp";
	}
	//findOrderByOidWithAjax
		public String findOrderByOidWithAjax(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//服务端获取到订单ID,
			String oid=req.getParameter("id");
			//查询这个订单下所有的订单项以及订单项对应的商品信息,返回集合
			OrderService OrderService=new OrderServiceImp();
			Order order=OrderService.findOrderByOid(oid);
			//将返回的集合转换为JSON格式字符串,响应到客户端
			String jsonStr=JSONArray.fromObject(order.getList()).toString();
			//响应到客户端
			resp.setContentType("application/json;charset=utf-8");
			resp.getWriter().println(jsonStr);
			return null;
		}
		
		//updateOrderByOid
		public String updateOrderByOid(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//获取订单ID
			String oid=req.getParameter("oid");
			//根据订单ID查询订单
			OrderService OrderService=new OrderServiceImp();
			Order order=OrderService.findOrderByOid(oid);
			//设置订单状态
			order.setState(3);
			//修改订单信息
			OrderService.updateOrder(order);
			//重新定向到查询已发货订单
			resp.sendRedirect("/store_v5/AdminOrderServlet?method=findOrders&state=3");
			return null;
		}	

}
