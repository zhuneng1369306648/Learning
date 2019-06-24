package com.zy.service.site.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zy.dto.cond.ContentCond;
import com.zy.constant.Types;
import com.zy.dao.AttAchDao;
import com.zy.dao.CommentDao;
import com.zy.dao.ContentDao;
import com.zy.dao.MetaDao;
import com.zy.dto.StatisticsDto;
import com.zy.dto.cond.CommentCond;
import com.zy.model.CommentDomain;
import com.zy.model.ContentDomain;
import com.zy.service.site.SiteService;

@Service
public class SiteServiceImpl  implements SiteService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SiteServiceImpl.class);
	
	@Autowired
	private CommentDao commentDao;
	
	@Autowired
	private ContentDao contentDao;
	
	@Autowired
	private MetaDao metaDao;
	
	@Autowired
	private AttAchDao attAchDao;

	/*Spring Cache是作用在方法上的，其核心思想是这样的：当我们在调用一个缓存方法时会把该方法参数和返回结果
	作为一个键值对存放在缓存中，等到下次利用同样的参数来调用该方法时将不再执行该方法，而是直接从缓存中获取
	结果进行返回。所以在使用Spring Cache的时候我们要保证我们缓存的方法对于相同的方法参数要有相同的返回结果。
	
	*使用@Cacheable标记的方法在执行后Spring Cache将缓存其返回结果，
	*而使用@CacheEvict标记的方法会在方法执行前或者执行后移除Spring Cache中的某些元素。
	*
	*
	*@Cacheable可以标记在一个方法上，也可以标记在一个类上。当标记在一个方法上时表示该方法是支持缓存的，
	*当标记在一个类上时则表示该类所有的方法都是支持缓存的。
	*
	*
	*value属性是必须指定的，其表示当前方法的返回值是会被缓存在哪个Cache上的，对应Cache的名称。
	*其可以是一个Cache也可以是多个Cache，当需要指定多个Cache时其是一个数组。
	*
	*自定义策略是指我们可以通过Spring的EL表达式来指定我们的key。这里的EL表达式可以使用方法参数及它们对应的属性。
	*使用方法参数时我们可以直接使用“#参数名”或者“#p参数index”。
	*
	*/
	@Override
	@Cacheable(value = "siteCache", key = "'comments_' + #p0")
	public List<CommentDomain> getComments(int limit) {
		// TODO Auto-generated method stub
		LOGGER.debug("Enter recentComments method: limit={}",limit);
		if(limit < 0 || limit > 10) {
			limit = 10;
		}
		PageHelper.startPage(1,limit);
		List<CommentDomain> rs = commentDao.getCommentsByCond(new CommentCond());
		LOGGER.debug("Exit recentComments method");
		return rs;
	}

	@Override
    @Cacheable(value = "siteCache", key = "'newArticles_' + #p0")
    public List<ContentDomain> getNewArticles(int limit) {
        LOGGER.debug("Enter recentArticles method:limit={}",limit);
        if (limit < 0 || limit > 10) {
            limit = 10;
        }
        PageHelper.startPage(1,limit);
        List<ContentDomain> rs = contentDao.getArticleByCond(new ContentCond());
        LOGGER.debug("Exit recentArticles method");
        return rs;
    }

	@Override
	@Cacheable(value = "siteCache", key = "'statistics_'")
	public StatisticsDto getStatistics() {
		// TODO Auto-generated method stub
		LOGGER.debug("Enter recentStatistics method");
		//文章总数
		Long articles = contentDao.getArticleCount();
		
		//评论总数
		Long comments = commentDao.getCommentCount();
		
		//链接数
		Long links = metaDao.getMetasCountByType(Types.LINK.getType());
		
		//获取附件数
		Long attAches = attAchDao.getAttAchCount();
		
		StatisticsDto rs = new StatisticsDto();
		rs.setArticles(articles);
		rs.setComments(comments);
		rs.setLinks(links);
		rs.setAttachs(attAches);
		LOGGER.debug("Exit recentStatistics method");
		return rs;
	}

}
