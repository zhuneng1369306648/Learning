package com.zy.chapter22.service;

import com.zy.chapter22.pojo.RedPacket;

public interface RedPacketService {
	public RedPacket getRedPacket(Long id);

	
	public int decreaseRedPacket(Long id);
}
