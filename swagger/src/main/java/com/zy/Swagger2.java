package com.zy;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configurable
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi() {
		 return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.abel.example.controller"))
	                .paths(PathSelectors.any())
	                .build();
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Spring Boot中使用swqgger2构建restfulApis")
				.description(" ")
				.termsOfServiceUrl("网址")
				.contact("abel")
				.version("1.0")
				.build();
				
	}

}
