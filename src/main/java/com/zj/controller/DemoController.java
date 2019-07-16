package com.zj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zj.bean.Demo;
import com.zj.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService; 
	
	@RequestMapping("hello")
	public String showHello() {
		
		return "Hello World!_1";
	}
	
	@RequestMapping("list")
	public List<Demo> findAll(){
		
		List<Demo> list = demoService.findAll();
		//int a = 1/0;					
		return list;
	}
	
}
