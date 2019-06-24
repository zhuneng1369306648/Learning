package com.zy.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
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

import com.github.pagehelper.PageInfo;
import com.zy.exception.BusinessException;
import com.zy.utils.TaleUtils;
import com.zy.constant.WebConst;
import com.zy.constant.LogActions;
import com.zy.controller.BaseController;
import com.zy.dto.StatisticsDto;
import com.zy.model.CommentDomain;
import com.zy.model.ContentDomain;
import com.zy.model.LogDomain;
import com.zy.model.UserDomain;
import com.zy.service.log.LogService;
import com.zy.service.site.SiteService;
import com.zy.service.user.UserService;
import com.zy.utils.APIResponse;
import com.zy.utils.GsonUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("后台首页")
@Controller("adminIndexController")
@RequestMapping(value = "/admin")
public class IndexController extends BaseController{
	
	private static final  Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LogService logService;

	@Autowired
	private SiteService siteService;

	@ApiOperation("进入首页")
	@GetMapping(value = {"","/index"})
	public String index(HttpServletRequest request) {
		LOGGER.info("Enter admin index method");
		//获取5条评论
		List<CommentDomain> comments = siteService.getComments(5);
		//获取5篇文章
		List<ContentDomain> contents = siteService.getNewArticles(5);
		//获取后台统计数
		StatisticsDto statistics = siteService.getStatistics();
		//获取五篇日志
		PageInfo<LogDomain> logs = logService.getLogs(1,5);
		List<LogDomain> list = logs.getList();
		request.setAttribute("comments",comments);
        request.setAttribute("articles",contents);
        request.setAttribute("statistics",statistics);
        request.setAttribute("logs",list);
        LOGGER.info("Exit admin index method");
        return "admin/index";
		
	}
	
	@GetMapping(value = "/profile")
	public String profile() {
		return "admin/profile";
	}
	
	/**
     * 保存个人信息
     * @param screenName    用户名称
     * @param email         邮箱
     * @param request       请求对象
     * @param session       请求session
     * @return
     */
	@PostMapping(value = "/profile")
	@ResponseBody
	public APIResponse saveProfile(
			@RequestParam String screenName,
			@RequestParam String email,
			HttpServletRequest request,
			HttpSession session
			) {
		UserDomain users = this.user(request);
		if(StringUtils.isNotBlank(screenName) && StringUtils.isNotBlank(email)) {
			UserDomain temp = new UserDomain();
			temp.setUid(users.getUid());
			temp.setScreenName(screenName);
			temp.setEmail(email);
			//更新数据
			userService.updateUserInfo(temp);
			//写入日志
			logService.addLog(LogActions.UP_INFO.getAction(), GsonUtils.toJsonString(temp),request.getRemoteAddr(),this.getUid(request));

            // 更新session中的数据
			UserDomain originAL = (UserDomain) session.getAttribute(WebConst.LOGIN_SESSION_KEY);
            originAL.setScreenName(screenName);
            originAL.setEmail(email);
            session.setAttribute(WebConst.LOGIN_SESSION_KEY, originAL);
        }
        return APIResponse.success();
	}
	
	@PostMapping(value = "/password")
	@ResponseBody
	public APIResponse upPwd(
			@RequestParam String oldPassword,
			@RequestParam String newPassword,
			HttpServletRequest request,
			HttpSession session
			) {
		UserDomain users = this.user(request);
		if(StringUtils.isBlank(oldPassword) || StringUtils.isBlank(newPassword)) {
			return APIResponse.fail("请确认信息输入完整");
		}
		if (!users.getPassword().equals(TaleUtils.MD5encode(users.getUsername() + oldPassword))) {
            return APIResponse.fail("旧密码错误");
        }

        if (newPassword.length() < 6 || newPassword.length() > 14) {
            return APIResponse.fail("请输入6-14位密码");
        }
        try {
            UserDomain temp = new UserDomain();
            temp.setUid(users.getUid());
            String pwd = TaleUtils.MD5encode(users.getUsername() + newPassword);
            temp.setPassword(pwd);
            userService.updateUserInfo(temp);
            logService.addLog(LogActions.UP_PWD.getAction(), null,request.getRemoteAddr(),this.getUid(request));

            // 更新session中的数据
            UserDomain originAL = (UserDomain) session.getAttribute(WebConst.LOGIN_SESSION_KEY);
            originAL.setPassword(pwd);
            session.setAttribute(WebConst.LOGIN_SESSION_KEY,originAL);
            return APIResponse.success();
        } catch (Exception e) {
            String msg = "密码修改失败";
            if (e instanceof BusinessException) {
                msg = e.getMessage();
            } else {
                LOGGER.error(msg,e);
            }
            return APIResponse.fail(msg);
        }
    }


}