package com.spring.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.springcloud.entity.Dept;

//@FeignClient(value="MICROSESPRINGCLOUD-DEPT")
@FeignClient(value="MICROSESPRINGCLOUD-DEPT",fallbackFactory=DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

	@PostMapping(value="/detp/add")
	public boolean add(@RequestBody Dept dept) throws Exception;

	@GetMapping(value="/detp/get/{id}")
	public Dept get(@PathVariable("id") Integer id) throws Exception;

	@GetMapping(value="/detp/list")
	public List<Dept> list() throws Exception;
}
