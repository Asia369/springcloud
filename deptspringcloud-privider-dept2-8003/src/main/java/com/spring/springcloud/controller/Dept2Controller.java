package com.spring.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dept2Controller {

	
	@GetMapping(value="/test")
	public boolean test() throws Exception {
		System.out.println("Dept2Controller test 方法访问成功！");
		return true;
	}
}
