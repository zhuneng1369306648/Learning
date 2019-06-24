package com.zy.store.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.store.domain.Category;
import com.zy.store.service.CategoryService;
import com.zy.store.service.serviceImp.CategoryServiceImp;
import com.zy.store.utils.JedisUtils;
import com.zy.store.web.base.BaseServlet;

import net.sf.json.JSONArray;
import redis.clients.jedis.Jedis;
public class CategoryServlet extends BaseServlet {
	//findAllCats
	public String findAllCats(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		//在redis中获取全部分类信息
		Jedis jedis = JedisUtils.getJedis();
		String jsonStr=jedis.get("allCats");
		if(null==jsonStr||"".equals(jsonStr))
		{
			//调用业务层获取全部分类
			CategoryService CategoryService=new CategoryServiceImp();
			List<Category> list=CategoryService.getAllCats();
			//将全部分类转换为json格式
			jsonStr=JSONArray.fromObject(list).toString();
			System.out.println(jsonStr);
			//将获取到的JSON格式的数据存入Redis中
			jedis.set("allCats", jsonStr);
			System.out.println("Redis缓存中没有数据");
			//将全部分类信息响应到客户端
			//告诉浏览器本次响应的数据是json格式的字符串
			resp.setContentType("application/json;charset=utf-8");
			resp.getWriter().print(jsonStr);
			
		}else {
			System.out.println("Redis中有数据");
			//将全部分类信息响应到客户端
			//告诉浏览器本次响应的数据时json格式的
			resp.setContentType("application/json;charset=utf-8");
			resp.getWriter().print(jsonStr);
			
		}
		JedisUtils.closeJedis(jedis);
		return null;
		
	}
}
