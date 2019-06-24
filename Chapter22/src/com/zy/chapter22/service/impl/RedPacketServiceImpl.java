package com.zy.chapter22.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zy.chapter22.dao.RedPacketDao;
import com.zy.chapter22.pojo.RedPacket;
import com.zy.chapter22.service.RedPacketService;
@Service
public class RedPacketServiceImpl implements RedPacketService{
	
	@Autowired
	private RedPacketDao redPacketDao=null;

	@Transactional(isolation=Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public RedPacket getRedPacket(Long id) {
		// TODO Auto-generated method stub
		return redPacketDao.getRedPacket(id);
	}

	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public int decreaseRedPacket(Long id) {
		// TODO Auto-generated method stub
		return redPacketDao.decreaseRedPacket(id);
	}

}
