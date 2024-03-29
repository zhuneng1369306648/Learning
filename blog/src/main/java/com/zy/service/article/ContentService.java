package com.zy.service.article;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zy.dto.cond.ContentCond;
import com.zy.model.ContentDomain;
import com.zy.model.MetaDomain;


/**
 * 文章相关Service接口
 */
public interface ContentService {

    /***
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
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentDomain> getArticlesByCond(ContentCond contentCond, int page, int limit);

    /**
     * 删除文章
     * @param cid
     */
    void deleteArticleById(Integer cid);

    /**
     * 添加文章点击量
     * @param content
     */
    void updateContentByCid(ContentDomain content);

    /**
     * 通过分类获取文章
     * @param category
     * @return
     */
    List<ContentDomain> getArticleByCategory(String category);

    /**
     * 通过标签获取文章
     * @param tags
     * @return
     */
    List<ContentDomain> getArticleByTags(MetaDomain tags);
}
