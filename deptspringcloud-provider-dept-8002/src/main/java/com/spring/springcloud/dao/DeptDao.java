package com.spring.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.springcloud.entity.Dept;

@Mapper
public interface DeptDao {

	// 添加
	public boolean addDept(Dept dept)throws Exception;
	
	// 查询
	public Dept findById(Integer id)throws Exception;
	
	// 查询所有
	public List<Dept> findAll()throws Exception; 
	
}
