package com.spring.springcloud.service;

import java.util.List;

import com.spring.springcloud.entity.Dept;

public interface DeptService {

	// 添加
	public boolean add(Dept dept) throws Exception;

	// 查询
	public Dept get(Integer id) throws Exception;

	// 查询所有
	public List<Dept> list() throws Exception;
}
