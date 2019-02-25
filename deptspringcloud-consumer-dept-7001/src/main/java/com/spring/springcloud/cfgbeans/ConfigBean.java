package com.spring.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// 替代之前Spring的application.xml文件
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced // 客户在访问的时候带上负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
