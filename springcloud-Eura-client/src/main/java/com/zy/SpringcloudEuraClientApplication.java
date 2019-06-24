package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEuraClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEuraClientApplication.class, args);
	}

}
