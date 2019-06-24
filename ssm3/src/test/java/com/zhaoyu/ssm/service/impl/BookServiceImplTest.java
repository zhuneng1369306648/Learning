package com.zhaoyu.ssm.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhaoyu.ssm.BaseTest;
import com.zhaoyu.ssm.dto.AppointExecution;
import com.zhaoyu.ssm.service.BookService;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {
        long bookId = 1002; //此处测试需要每次都改变，否则就会预约失败报错产生repeat 错误
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }
}
