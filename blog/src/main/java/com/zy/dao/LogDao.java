package com.zy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zy.model.LogDomain;

/**
 * 日志dao层接口
 */
@Mapper
public interface LogDao {

    /**
     * 添加日志
     * @param logDomain
     * @return
     */
    int addLog(LogDomain logDomain);

    /**
     * 获取日志
     * @return
     */
    List<LogDomain> getLogs();
}
