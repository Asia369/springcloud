package com.spring.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springcloud.entity.Dept;
import com.spring.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@Autowired
	private DiscoveryClient client;
	
	@GetMapping(value="/dept/discovery")
	public Object discovery() {
		List<String> services=client.getServices();
		System.out.println("-------"+services);
		List<ServiceInstance> instances= client.getInstances("MICROSESPRINGCLOUD-DEPT");
		for (ServiceInstance serviceInstance : instances) {
			System.out.println("微服务ID："+serviceInstance.getServiceId());
			System.out.println("主机名称："+serviceInstance.getHost());
			System.out.println("端口："+serviceInstance.getPort());
			System.out.println("地址："+serviceInstance.getUri());
		}
		return this.client;
	}
	
	
	@PostMapping(value="/detp/add")
	public boolean add(@RequestBody Dept dept) throws Exception {
		return deptService.add(dept);
	}

	@GetMapping(value="/detp/get/{id}")
	public Dept get(@PathVariable("id") Integer id) throws Exception {
		return deptService.get(id);
	}

	@GetMapping(value="/detp/list")
	public List<Dept> list() throws Exception {
		return deptService.list();
	}
}
