package com.zy.store.service;

import java.util.List;

import com.zy.store.domain.Category;

public interface CategoryService {
	List<Category> getAllCats()throws Exception;

	void addCategory(Category c)throws Exception;

}
