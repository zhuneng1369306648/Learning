package com.zhaoyu.ssm.service;

import java.util.List;

import com.zhaoyu.ssm.dto.AppointExecution;
import com.zhaoyu.ssm.entity.Book;

/**
 * @author yyy
 *业务接口，站在使用者角度设计接口，三个方面，方法定义粒度，参数，返回类型（return  类型、异常）
 */
public interface BookService {
	/**
	 * 查询一本图书
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);
	
	/**查询所有图书
	 * @return
	 */
	List<Book> getList();
     
	
	/**预约图书
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId,long studentId);
}
