package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 表示本服务启动后悔自动注入到Eureka服务列表中
@EnableDiscoveryClient // 注册服务发现   
public class Dept2Provider8003_Spring {

	public static void main(String[] args) {
		SpringApplication.run(Dept2Provider8003_Spring.class, args);
	}
}
