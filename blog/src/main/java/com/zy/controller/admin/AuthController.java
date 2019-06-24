package com.zy.controller.admin;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zy.exception.BusinessException;
import com.zy.constant.LogActions;
import com.zy.constant.WebConst;
import com.zy.controller.BaseController;
import com.zy.model.UserDomain;
import com.zy.service.log.LogService;
import com.zy.service.user.UserService;
import com.zy.utils.APIResponse;
import com.zy.utils.TaleUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api("登录相关接口")
@Controller
@RequestMapping("/admin")
public class AuthController  extends BaseController{
	
	//目的：使用指定的类XXX初始化日志对象，方便在日志输出的时候，可以打印出日志信息所属的类。
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	private UserService userService;
	
	@Autowired
	private LogService logService;
	
	@ApiOperation("登录跳转页")
	@GetMapping(value = "/login")
	public String login() {
		return "admin/login";
	}
	
	@ApiOperation("登录")
	@PostMapping(value = "/login")
	@ResponseBody
	public APIResponse toLogin(
			HttpServletRequest request,
			HttpServletResponse response,
			 @ApiParam(name = "username", value = "用户名", required = true)
            @RequestParam(name = "username", required = true)
            String username,
            @ApiParam(name = "password", value = "用户名", required = true)
            @RequestParam(name = "password", required = true)
            String password,
            @ApiParam(name = "remember_me", value = "记住我", required = false)
            @RequestParam(name = "remember_me", required = false)
            String remember_me
			) {
		Integer error_count = cache.get("login_error_eount");
		try {
			//调用service方法
			UserDomain userInfo = userService.login(username,password);
			//设置用户信息session
			request.getSession().setAttribute(WebConst.LOGIN_SESSION_KEY, userInfo);
			//判断是否勾选记住我
			if(StringUtils.isNotBlank(remember_me)) {
				TaleUtils.setCookie(response, userInfo.getUid());
			}
			//写入日志
			logService.addLog(LogActions.LOGIN.getAction(), userInfo.getUsername()+"用户", request.getRemoteAddr(), userInfo.getUid());
		       
		}catch (Exception e) {
			LOGGER.error(e.getMessage());
			error_count = null ==error_count ? 1 : error_count +1;
			if(error_count > 3) {
				return APIResponse.fail("您输入密码已经错误超过三次，请10分钟后");
			}
			System.out.println("error_count");
			//设置缓存为10分钟
			cache.set("login_error_count", error_count, 10 * 60);
			 String msg = "登录失败";
	            if (e instanceof BusinessException) {
	                msg = e.getMessage();
	            } else {
	                LOGGER.error(msg,e);
	            }
	            return APIResponse.fail(msg);
	        }
	        // 返回登录成功信息
	        return APIResponse.success();
	    }
	
	 @RequestMapping(value = "/logout")
	    public void logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
	        // 移除session
	        session.removeAttribute(WebConst.LOGIN_SESSION_KEY);
	        // 设置cookie值和时间为空
	        Cookie cookie = new Cookie(WebConst.USER_IN_COOKIE, "");
	        cookie.setValue(null);
	        cookie.setMaxAge(0);
	        cookie.setPath("/");
	        response.addCookie(cookie);
	        try {
	            // 跳转到登录页面
	            response.sendRedirect("/admin/login");
	        } catch (IOException e) {
	            e.printStackTrace();
	            LOGGER.error("注销失败",e);
	        }
	    }
}
