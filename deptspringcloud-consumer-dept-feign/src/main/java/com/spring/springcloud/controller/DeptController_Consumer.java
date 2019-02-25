package com.spring.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springcloud.entity.Dept;
import com.spring.springcloud.service.DeptClientService;

/**
 * 消费者
 * @author liyazhou
 *
 */
@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService deptClientService;
	
	@RequestMapping(value="/consumer/detp/add")
	public boolean add(Dept dept) throws Exception {
		return deptClientService.add(dept);
	}

	@GetMapping(value="/consumer/detp/get/{id}")
	public Dept get(@PathVariable("id") Integer id) throws Exception {
		return deptClientService.get(id);
	}

	@GetMapping(value="/consumer/detp/list")
	public List<Dept> list() throws Exception {
		return deptClientService.list();
	}
}
