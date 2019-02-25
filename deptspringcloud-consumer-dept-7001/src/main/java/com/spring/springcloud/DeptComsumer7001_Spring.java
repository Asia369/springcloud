package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptComsumer7001_Spring {

	public static void main(String[] args) {
		SpringApplication.run(DeptComsumer7001_Spring.class, args);
	}
}
