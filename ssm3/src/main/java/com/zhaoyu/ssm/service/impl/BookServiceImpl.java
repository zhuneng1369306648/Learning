package com.zhaoyu.ssm.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhaoyu.ssm.dao.AppointmentDao;
import com.zhaoyu.ssm.dao.BookDao;
import com.zhaoyu.ssm.dto.AppointExecution;
import com.zhaoyu.ssm.entity.Appointment;
import com.zhaoyu.ssm.entity.Book;
import com.zhaoyu.ssm.enums.AppointStateEnum;
import com.zhaoyu.ssm.exception.AppointException;
import com.zhaoyu.ssm.exception.NoNumberException;
import com.zhaoyu.ssm.exception.RepeatAppointException;
import com.zhaoyu.ssm.service.BookService;
@Service
public class BookServiceImpl implements BookService{

	
	
	@Autowired //注入service依赖
	private BookDao bookDao;
	
	@Autowired
	private AppointmentDao appointmentDao;
	@Override
	public Book getById(long bookId) {
		// TODO Auto-generated method stub
		return bookDao.queryById(bookId);
	}

	@Override
	public List<Book> getList() {
		// TODO Auto-generated method stub
		return bookDao.queryAll(0, 1000);
	}

	@Override
	@Transactional
	/**
     * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */
	public AppointExecution appoint(long bookId, long studentId) {
		// TODO Auto-generated method stub
		try {
		    int update = bookDao.reduceNumber(bookId);
		    if(update <= 0) {
			    throw new NoNumberException("no number");
		    }else {
		    	int insert = appointmentDao.insertAppointment(bookId, studentId);
		    	if(insert <= 0) {
		    		throw new RepeatAppointException("repeat apoint");
		    	} else {// 预约成功
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
		        }
            }
        // 要先于catch Exception异常前先catch住再抛出，不然自定义的异常也会被转换为AppointException，导致控制层无法具体识别是哪个异常
        } catch (NoNumberException e1) {
            throw e1;
        } catch (RepeatAppointException e2) {
            throw e2;
        } catch (Exception e) {
            //logger.error(e.getMessage(), e);     //此处有错误，添加包依旧没用，不知道怎么修改
            // 所有编译期异常转换为运行期异常
            //return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);//错误写法
            throw new AppointException("appoint inner error:" + e.getMessage());
        }
    }

}