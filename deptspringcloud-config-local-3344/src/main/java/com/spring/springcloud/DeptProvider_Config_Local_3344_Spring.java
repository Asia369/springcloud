package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer  // 启动ConfigServer
public class DeptProvider_Config_Local_3344_Spring {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_Config_Local_3344_Spring.class, args);
	}
}
