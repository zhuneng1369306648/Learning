package com.zy.chapter22.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zy.chapter22.dao.RedPacketDao;
import com.zy.chapter22.dao.UserRedPacketDao;
import com.zy.chapter22.pojo.RedPacket;
import com.zy.chapter22.pojo.UserRedPacket;
import com.zy.chapter22.service.UserRedPacketService;
@Service
public class UserRedPacketServiceImpl implements UserRedPacketService{

	@Autowired
	private UserRedPacketDao userRedPacketDao=null;
	
	@Autowired
	private RedPacketDao redPacketDao=null;
	
	private static final int FAILED = 0;
	
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public int grapRedPacket(Long redPacketId, Long userId) {
		// TODO Auto-generated method stub
		RedPacket redPacket = redPacketDao.getRedPacket(redPacketId);
		if(redPacket.getStock() > 0) {
			redPacketDao.decreaseRedPacket(redPacketId);
			UserRedPacket userRedPacket = new UserRedPacket();
			userRedPacket.setRedPacketId(redPacketId);
			userRedPacket.setUserId(userId);
			userRedPacket.setAmount(redPacket.getUnitAmount());
			userRedPacket.setNote("抢红包" + redPacketId);
			int result = userRedPacketDao.grapRedPacket(userRedPacket);
			return result;
		}
		return FAILED;
	}

	
	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public int grapRedPacketForVersion(Long redPacketId, Long userId) {
		// TODO Auto-generated method stub
		RedPacket redPacket = redPacketDao.getRedPacket(redPacketId);
		//当红包库存大于0
		if(redPacket.getStock() > 0) {
			int update = redPacketDao.grapRedPacketForVersion(redPacketId, redPacket.getVersion());
			if(update == 0) {
				return FAILED;
			}
			UserRedPacket userRedPacket = new UserRedPacket();
			userRedPacket.setRedPacketId(redPacketId);
			userRedPacket.setUserId(userId);
			userRedPacket.setAmount(redPacket.getUnitAmount());
			userRedPacket.setNote("抢红包" + redPacketId);
			int result = userRedPacketDao.grapRedPacket(userRedPacket);
			return result;
		}
		return FAILED;
	}

}
