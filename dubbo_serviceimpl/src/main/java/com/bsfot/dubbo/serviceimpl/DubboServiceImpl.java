package com.bsfot.dubbo.serviceimpl;

import org.springframework.stereotype.Service;

import com.bsoft.cn.dubbo.service.TestDubboService;


@Service("dubboServiceImpl")
public class DubboServiceImpl implements TestDubboService{

	@Override
	public String getData(String name) {
		return "hello world!"+name;
	}

}
