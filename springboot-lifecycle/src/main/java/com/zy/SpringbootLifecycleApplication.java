package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zy.config.WebConfig;

@SpringBootApplication
public class SpringbootLifecycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLifecycleApplication.class, args);
		  // 返回 IOC 容器，使用注解配置，传入配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        System.out.println("容器创建完毕");
        // User user = context.getBean(User.class);
        // 关闭 IOC 容器
        context.close();
	}

}
