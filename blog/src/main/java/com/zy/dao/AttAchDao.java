package com.zy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zy.dto.AttAchDto;
import com.zy.model.AttAchDomain;

/**
 * 文件相关Dao接口
 */
@Mapper
public interface AttAchDao {

    /**
     * 添加单个附件文件
     * @param attAchDomain
     */
    void addAttAch(AttAchDomain attAchDomain);

    /**
     * 获取所有的附件信息
     * @return
     */
    List<AttAchDto> getAtts();

    /**
     * 获取附件总数
     * @return
     */
    Long getAttAchCount();

    /**
     * 通过ID获取附件信息
     * @param id
     * @return
     */
    AttAchDto getAttAchById(@Param("id") Integer id);

    /**
     * 通过ID删除附件信息
     * @param id
     */
    void deleteAttAch(@Param("id") Integer id);
}
