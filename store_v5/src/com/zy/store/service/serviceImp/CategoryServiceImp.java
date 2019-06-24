package com.zy.store.service.serviceImp;

import java.util.List;

import com.zy.store.dao.CategoryDao;
import com.zy.store.domain.Category;
import com.zy.store.service.CategoryService;
import com.zy.store.utils.BeanFactory;
import com.zy.store.utils.JedisUtils;

import redis.clients.jedis.Jedis;

public class CategoryServiceImp implements CategoryService{

	CategoryDao CategoryDao=(CategoryDao)BeanFactory.createObject("CategoryDao");
	
	
	@Override
	public List<Category> getAllCats() throws Exception {
		return CategoryDao.getAllCats();
	}

	@Override
	public void addCategory(Category c) throws Exception {
		//本质是向MYSQL插入一条数据
		CategoryDao.addCategory(c);
		//更新redis缓存
		Jedis jedis = JedisUtils.getJedis();
		jedis.del("allCats");
		JedisUtils.closeJedis(jedis);
	}
}
