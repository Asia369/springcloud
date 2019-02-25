package com.spring.springcloud.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springcloud.dao.DeptDao;
import com.spring.springcloud.entity.Dept;
import com.spring.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptDao deptDao;
	
	public boolean add(Dept dept) throws Exception {
		return deptDao.addDept(dept);
	}

	public Dept get(Integer id) throws Exception {
		return deptDao.findById(id);
	}

	public List<Dept> list() throws Exception {
		return deptDao.findAll();
	}

}
