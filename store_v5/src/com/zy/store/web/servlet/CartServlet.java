package com.zy.store.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.store.domain.Cart;
import com.zy.store.domain.CartItem;
import com.zy.store.domain.Product;
import com.zy.store.service.ProductService;
import com.zy.store.service.serviceImp.ProductServiceImp;
import com.zy.store.web.base.BaseServlet;

public class CartServlet extends BaseServlet {

	//添加购物项到购物车
	public String addCartItemToCart(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		//从session获取购物车
		Cart cart=(Cart)req.getSession().getAttribute("cart");
		if(null==cart) {
			cart=new Cart();
			req.getSession().setAttribute("cart", cart);
		}
		//如果获取到,使用即可
		//获取到商品id,数量
		String pid = req.getParameter("pid");
		int num=Integer.parseInt(req.getParameter("quantity"));
		ProductService ProductService=new ProductServiceImp();
		Product product = ProductService.findProductByPid(pid);
		//获取到代购买的购物项
		CartItem cartItem=new CartItem();
		cartItem.setNum(num);
		cartItem.setProduct(product);
		
		//调用购物车上的方法
		cart.addCartItemToCar(cartItem);
		resp.sendRedirect("/store_v5/jsp/cart.jsp");
		return null;
		
		
	}
	
	//removeCartItem
	public String removeCartItem(HttpServletRequest req,HttpServletResponse resp)throws Exception{
		String pid = req.getParameter("id");
		//获取到购物车
		Cart cart=(Cart)req.getSession().getAttribute("cart");
		cart.removeCartItem(pid);
		resp.sendRedirect("/store_v5/jsp/cart.jsp");
		return null;
	}
	//clearCart
		public String clearCart(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			//获取购物车
			Cart cart=(Cart)req.getSession().getAttribute("cart");
			//调用购物车上的清空购物车方法
			cart.clearCart();
			//重新定向到/jsp/cart.jsp
			resp.sendRedirect("/store_v5/jsp/cart.jsp");
			return null;
		}

}
