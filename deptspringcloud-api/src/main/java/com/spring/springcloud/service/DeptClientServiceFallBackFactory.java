package com.spring.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.springcloud.entity.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {

			public boolean add(Dept dept) throws Exception {
				return false;
			}

			public Dept get(Integer id) throws Exception {
				return new Dept().setDid(new Long(id)).setDname("当前id:"+id+"没有对应的信息，null- @HystriCommand").setDb_source("no this db_resource");
			}

			public List<Dept> list() throws Exception {
				return null;
			}
		};
	}

}
