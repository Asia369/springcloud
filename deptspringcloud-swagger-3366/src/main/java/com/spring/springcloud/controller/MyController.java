package com.spring.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class MyController {

	@ApiOperation(value="测试方法",notes="测试方法notes")
	@GetMapping(value="/swagger/hao")
	public String hao(String wc) {
		System.out.println("wwwwwww:"+wc);
		System.out.println("hao....");
		return "hello "+wc;
	}
}
