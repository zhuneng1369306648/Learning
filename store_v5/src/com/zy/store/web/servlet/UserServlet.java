package com.zy.store.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zy.store.domain.User;
import com.zy.store.service.UserService;
import com.zy.store.service.serviceImp.UserServiceImp;
import com.zy.store.utils.MailUtils;
import com.zy.store.utils.MyBeanUtils;
import com.zy.store.utils.UUIDUtils;
import com.zy.store.web.base.BaseServlet;

public class UserServlet extends BaseServlet {
	
	public String registUI(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		return "/jsp/register.jsp";
	}
	public String loginUI(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return "/jsp/login.jsp";
	}
	public String userRegist(HttpServletRequest request,HttpServletResponse response) throws Exception{
		//获得数据并且封装
		Map<String,String[]> map = request.getParameterMap();//前端提交到Servlet或者Action里面的参数Map哈
		User user = new User();
		MyBeanUtils.populate(user, map);
		user.setUid(UUIDUtils.getId());//激活码.0未激活
		user.setState(0);
		user.setCode(UUIDUtils.getCode());
		System.out.println(user);
		
		//调用业务层注册功能
		UserService UserService = new UserServiceImp();
		try {
		UserService.userRegist(user);
		//注册成功，想用户邮箱发送信息，跳转到提示页面
		//发送邮件
		MailUtils.sendMail(user.getEmail(), user.getCode());
		request.setAttribute("msg", "用户注册成功，请激活");
		}catch(Exception e) {
			request.setAttribute("msg", "用户注册失败，请重新注册");
		}
		/*request.setAttribute("result",username);
		在request对象中加入名为result的属性并附值为username，因为request对象是可以更改的，你可以在同一个请求中象这样访问这个属性。

		虽然类似session，但与session是有所区别的，request.setAttribute设置的属性只能在当前request只使用，比如你在Action中设置result属性，需要到jsp页面中读取：
		request.setAttribute("result",username);
		requests.getRequestDispatcher("result.jsp").forward(request, response);
		jsp页面获取该值：
		request.getAttribute( "result");

		因为一同将当前action的request与response对象都发送过来，相当于直接操作自身页面。 
		*/
		return "/jsp/info.jsp";
		
	}
	//userlogin
	public String userLogin(HttpServletRequest request,HttpServletResponse response)throws Exception{
		//获取用户数据（账户，密码）
		User user = new User();
		MyBeanUtils.populate(user, request.getParameterMap());
		UserService UserService = new UserServiceImp();
		User user02=null;
		try {
		user02=UserService.userLogin(user);
		//用户登录成功，将用户信息放在session中
		request.getSession().setAttribute("loginUser", user02);
		/*比如说，用户登录后，我通过
		User loginUser = new User();
		loginUser.setLoginStatus(true);
		session.setAttribute("user",user);
		将用户的信息保存在session中。
		那么在其他地方，我就可以通过
		User loginUser = (User)session.getAttribute("user");
		来获取用户的登录信息，并判断他是否登录等等。 */
		response.sendRedirect("/store_v5/index.jsp");
		return null;
		}catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
			//想request中放入失败的信息
			request.setAttribute("msg", msg);
			return "/jsp/login.jsp";
		}
		
	}
	public String logOut(HttpServletRequest request, HttpServletResponse response) throws Exception {
		  //清除session
			request.getSession().invalidate();
		  //重新定向到首页
		  response.sendRedirect("/store_v5/index.jsp");
		  return null;	
	}
	

}
