package com.zy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zy.dto.cond.ContentCond;
import com.zy.model.ContentDomain;
import com.zy.model.RelationShipDomain;

/**
 * 文章相关Dao接口
 */
@Mapper
public interface ContentDao {

    /**
     * 添加文章
     * @param contentDomain
     */
    void addArticle(ContentDomain contentDomain);

    /**
     * 根据编号获取文章
     * @param cid
     * @return
     */
    ContentDomain getArticleById(Integer cid);

    /**
     * 更新文章
     * @param contentDomain
     */
    void updateArticleById(ContentDomain contentDomain);

    /**
     * 根据条件获取文章列表
     * @param contentCond
     * @return
     */
    List<ContentDomain> getArticleByCond(ContentCond contentCond);

    /**
     * 删除文章
     * @param cid
     */
    void deleteArticleById(Integer cid);

    /**
     * 获取文章总数
     * @return
     */
    Long getArticleCount();

    /**
     * 通过分类名获取文章
     * @param category
     * @return
     */
    List<ContentDomain> getArticleByCategory(@Param("category") String category);

    /**
     * 通过标签获取文章
     * @param cid
     * @return
     */
    List<ContentDomain> getArticleByTags(List<RelationShipDomain> cid);
}
