package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
// 开启使用Feign接口的调用方法
@EnableFeignClients(basePackages= {"com.spring.springcloud"})
@ComponentScan("com.spring.springcloud")
public class DeptComsumer_Feign_Spring {

	public static void main(String[] args) {
		SpringApplication.run(DeptComsumer_Feign_Spring.class, args);
	}
}
