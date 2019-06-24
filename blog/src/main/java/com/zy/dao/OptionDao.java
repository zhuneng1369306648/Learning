package com.zy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zy.model.OptionsDomain;

/**
 * 网站选项相关Dao接口
 */
@Mapper
public interface OptionDao {

    /**
     * 获取网站全部信息
     * @return
     */
    List<OptionsDomain> getOptions();

    /**
     * 更新网站配置
     * @param option
     */
    void updateOptionByName(OptionsDomain option);

    /**
     * 通过名称网站配置
     * @param name
     * @return
     */
    OptionsDomain getOptionByName(String name);
}
