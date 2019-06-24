package com.zy.controller;

import javax.servlet.http.HttpServletRequest;

import com.zy.model.UserDomain;
import com.zy.utils.MapCache;
import com.zy.utils.TaleUtils;

public abstract class BaseController {

	protected MapCache cache = MapCache.single();
	
	public BaseController title(HttpServletRequest request, String title) {
		request.setAttribute("title", title);
		return this;
	}
	
	/**
	 * 获取请求绑定的登录对象
	 * @param request
	 * @return
	 */
	public UserDomain user(HttpServletRequest request) {
		return TaleUtils.getLoginUser(request);
	}
	
	/**
	 * 获取请求绑定用户的uid
	 * @param request
	 * @return
	 */
	public Integer getUid(HttpServletRequest request) {
		return this.user(request).getUid();
	}
	
	/**
	 * 数组转字符串
	 * @param arr
	 * @return
	 */
	public String join(String[] arr) {
		StringBuffer buffer = new StringBuffer();
		String[] temp = arr;
		int length = arr.length;
		
		for(int i =0; i < length;i++) {
			String item = temp[i];
			buffer.append(",").append(item);
		}
		return buffer.length() > 0 ? buffer.substring(1) : buffer.toString();
		//substring返回一个新的字符串,
	}
}
