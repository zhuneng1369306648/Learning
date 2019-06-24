package com.zy.chapter22.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zy.chapter22.service.UserRedPacketService;

@Controller
@RequestMapping("/userRedPacket")
public class UserRedPacketController {

	@Autowired
	private UserRedPacketService userRedPacketService = null;

	@RequestMapping(value = "/grapRedPacket")
	@ResponseBody
	public Map<String, Object> grapRedPacket(Long redPacketId, Long userId) {
		// 抢红包
		int result = userRedPacketService.grapRedPacket(redPacketId, userId);
		Map<String, Object> retMap = new HashMap<String, Object>();
		boolean flag = result > 0;
		retMap.put("success", flag);
		retMap.put("message", flag ? "抢红包成功" : "抢红包失败");
		return retMap;
	}
	
	@RequestMapping(value="/grapRedPacketForVersion")
	@ResponseBody
	public Map<String, Object> grapRedPacketForVersion(Long redPacketId, Long userId){
		int result = userRedPacketService.grapRedPacketForVersion(redPacketId, userId);
		Map<String, Object> retMap = new HashMap<String, Object>();
		boolean flag = result > 0;
		retMap.put("success", flag);
		retMap.put("message", flag ? "抢红包成功" : "抢红包失败");
		return retMap;
		
	}
}