package com.zy;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.zy.bean.ConfigBean;
import com.zy.bean.TestConfigBean;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class,TestConfigBean.class})
public class SpringbootConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigApplication.class, args);
		SpringApplication app = new SpringApplication(ApplicationRunner.class);
		app.setAddCommandLineProperties(false);
		app.run(args);

	}

}
