package com.zy.chapter22.dao;

import org.springframework.stereotype.Repository;

import com.zy.chapter22.pojo.RedPacket;
import com.zy.chapter22.pojo.UserRedPacket;


@Repository
public interface RedPacketDao {
	public RedPacket getRedPacket(Long id);
	public int decreaseRedPacket(Long id);
	//public int grapRedPacketForVersion(UserRedPacket userRedPacket);
	public int grapRedPacketForVersion(Long redPacketId, Integer version);

}
