package com.zy.service.log.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.dao.LogDao;
import com.zy.model.LogDomain;
import com.zy.service.log.LogService;

@Service
public class LogServiceImpl implements LogService{

	
	@Autowired
	private LogDao logDao;
	@Override
	public void addLog(String action, String data, String ip, Integer authorId) {

		LogDomain logDomain = new LogDomain();
		logDomain.setAuthorId(authorId);
		logDomain.setIp(ip);
		logDomain.setData(data);
		logDomain.setAction(action);
		logDao.addLog(logDomain);
		
	}

	@Override
	public PageInfo<LogDomain> getLogs(int pageNum, int pageSize) {

		PageHelper.startPage(pageNum,pageSize);
		List<LogDomain> logs = logDao.getLogs();
		PageInfo<LogDomain> pageInfo = new PageInfo<>(logs);
		
		return pageInfo;
	}

}
