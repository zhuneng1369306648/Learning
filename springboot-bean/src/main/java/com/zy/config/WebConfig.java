package com.zy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zy.domain.User;

/**
 * @author MrBird
 */
@Configuration
// @ComponentScan(value = "cc.mrbird.demo"
        // , excludeFilters = {
        //         @Filter(type = FilterType.ANNOTATION,
        //                 classes = {Controller.class, Repository.class}),
        //         @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = User.class)
        //         @Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)
        // }
        // includeFilters = {
        //         @Filter(type = FilterType.ANNOTATION, classes = Service.class)
        // }, useDefaultFilters = false
// )
public class WebConfig {

    @Bean
    // @Conditional(MyCondition.class)
    // @Lazy
    // @Scope("prototype")
    public User user() {
        System.out.println("往IOC容器中注册user bean");
        return new User();
    }


}
