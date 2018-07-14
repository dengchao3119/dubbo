package com.bsoft.cn.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bsoft.cn.dubbo.service.TestDubboService;


@Controller
public class DubboController {
	
	@Autowired
	private TestDubboService service;
	
	@RequestMapping("/getData")
	@ResponseBody
	public String getData(String name){
		String data = service.getData(name);
		return data;
		
	}

}
