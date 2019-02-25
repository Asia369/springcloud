package com.spring.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.springcloud.entity.Dept;
import com.spring.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@GetMapping(value="/detp/get/{id}")
	@HystrixCommand(fallbackMethod="hystrix_Get")
	public Dept get(@PathVariable("id") Long id) throws Exception {
		Dept dept=deptService.get(id.intValue());
		if(null==dept) {
			throw new RuntimeException("当前ID:"+id+"没有对应的信息");
		}
		return dept;
	}
	
	public Dept hystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDid(id).setDname("当前id:"+id+"没有对应的信息，null- @HystriCommand").setDb_source("no this db_resource");
	}
}
