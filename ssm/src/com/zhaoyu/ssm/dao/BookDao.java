package com.zhaoyu.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaoyu.ssm.entity.Book;

public interface BookDao {
	
	/**
	 * @param id
	 * @return
	 */
	Book queryById(long id);
	
	/**
	 * 查询所有图书
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	
	/**
	 * 
	 * 减少官场数量
	 * @param bookId
	 * @return 如果影响行数大于1，表示更新的记录行数
	 */
	int reduceNumber(long bookId);

}
