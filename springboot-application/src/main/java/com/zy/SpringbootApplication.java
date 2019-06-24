package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
         /*SpringApplication application = new SpringApplication(SpringbootApplication.class);
         application.setBannerMode(Banner.Mode.OFF);
         application.setWebApplicationType(WebApplicationType.NONE);
         application.setHeadless(true);
         application.run(args);*/

        new SpringApplicationBuilder(SpringbootApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
