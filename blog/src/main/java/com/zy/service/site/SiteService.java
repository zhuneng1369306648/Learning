package com.zy.service.site;

import java.util.List;

import com.zy.dto.StatisticsDto;
import com.zy.model.CommentDomain;
import com.zy.model.ContentDomain;
/**
 * 网站相关Service接口
 */
public interface SiteService {

    /**
     * 获取评论列表
     * @param limit
     * @return
     */
    List<CommentDomain> getComments(int limit);

    /**
     * 获取文章列表
     * @param limit
     * @return
     */
    List<ContentDomain> getNewArticles(int limit);

    /**
     * 获取后台统计数
     * @return
     */
    StatisticsDto getStatistics();
}
