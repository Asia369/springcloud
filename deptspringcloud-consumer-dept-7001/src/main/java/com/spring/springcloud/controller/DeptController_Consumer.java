package com.spring.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.springcloud.entity.Dept;

/**
 * 消费者
 * @author liyazhou
 *
 */
@RestController
public class DeptController_Consumer {

	//private static final String REST_URL_PREFIX="http://localhost:8001";
	private static final String REST_URL_PREFIX="http://MICROSESPRINGCLOUD-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/detp/add")
	public boolean add(Dept dept) throws Exception {
		return restTemplate.postForObject(REST_URL_PREFIX+"/detp/add", dept, Boolean.class);
	}

	@GetMapping(value="/consumer/detp/get/{id}")
	public Dept get(@PathVariable("id") Integer id) throws Exception {
		return restTemplate.getForObject(REST_URL_PREFIX+"/detp/get/"+id,Dept.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/detp/list")
	public List<Dept> list() throws Exception {
		return restTemplate.getForObject(REST_URL_PREFIX+"/detp/list", List.class);
	}
}
