package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer6002_Spring {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer6002_Spring.class, args);
	}
}
