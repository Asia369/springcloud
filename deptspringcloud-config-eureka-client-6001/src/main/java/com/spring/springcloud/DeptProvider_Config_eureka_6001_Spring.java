package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeptProvider_Config_eureka_6001_Spring {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_Config_eureka_6001_Spring.class, args);
	}
}
