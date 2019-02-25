package com.spring.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy // 启动zuul的代理作用 
public class DeptProvider_zuul_9527_Spring {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_zuul_9527_Spring.class, args);
		System.out.println("zuul 已启动");
	}
}
