package com.zy;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zy.config.WebConfig;
import com.zy.domain.User;

@SpringBootApplication
public class SpringbootBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBeanApplication.class, args);
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
	        User user = context.getBean(User.class);
	        System.out.println(user);
	        String[] beanNames = context.getBeanNamesForType(User.class);
	        Arrays.stream(beanNames).forEach(System.out::println);
	}

}
