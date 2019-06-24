package com.zy.chapter22.dao;

import org.springframework.stereotype.Repository;

import com.zy.chapter22.pojo.UserRedPacket;

@Repository
public interface UserRedPacketDao {
    public int grapRedPacket(UserRedPacket userRedPacket);
    
}
