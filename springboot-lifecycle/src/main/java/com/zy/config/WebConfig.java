package com.zy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.zy.domain.Fish;
import com.zy.domain.User;

@Configuration
public class WebConfig {
	
	/*@Bean(initMethod = "init", destroyMethod = "destory")
	public User user() {
		return new User();
	}*/
	 @Scope("prototype")
     @Bean(initMethod = "init", destroyMethod = "destory")
     public User user() {
        return new User();
    }

    // @Bean
    // public Bird bird() {
    //     return new Bird();
    // }

    @Bean
    public Fish fish(){
        return new Fish();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor () {
        return new MyBeanPostProcessor();
    }

}
