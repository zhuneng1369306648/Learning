package com.zhaoyu.ssm.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//配置spring和Junit的整合，Junit启动时加载soringioc容器，spring-test,junit
@RunWith(SpringJUnit4ClassRunner.class)
/*@RunWith就是一个运行器

@RunWith(JUnit4.class)就是指用JUnit4来运行

@RunWith(SpringJUnit4ClassRunner.class),让测试运行于Spring测试环境

@RunWith(Suite.class)的话就是一套测试集合，*/
//告诉Junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseTest {

}
