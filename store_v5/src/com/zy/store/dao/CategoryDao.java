package com.zy.store.dao;

import java.util.List;

import com.zy.store.domain.Category;

public interface CategoryDao {
	List<Category> getAllCats()throws Exception;
	void addCategory(Category c)throws Exception;

}
