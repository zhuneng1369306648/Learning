package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudClient1Application.class, args);
	}

}
