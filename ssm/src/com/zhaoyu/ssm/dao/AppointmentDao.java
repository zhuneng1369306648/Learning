package com.zhaoyu.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.zhaoyu.ssm.entity.Appointment;

public interface AppointmentDao {
	
	/**
	 * 插入预约图书记录
	 * @param bookId
	 * @param studentId
	 * @return 插入的行数
	 */
	int insertAppointment(@Param("bookId")long bookId, @Param("studentId")long studentId);

	
	/**
	 * 
	 * 通过主键查询预约图书记录，并且携带图书实体
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId,@Param("studentId") long studentId);
	
	/*里为什么要给方法的参数添加@Param注解呢？是因为该方法有两个或以上的参数，一定要加，不然mybatis识别不了。
	上面的BookDao接口的queryById方法和reduceNumber方法只有一个参数book_id，所以可以不用加 @Param注解，当然加了也无所谓~*/
}
