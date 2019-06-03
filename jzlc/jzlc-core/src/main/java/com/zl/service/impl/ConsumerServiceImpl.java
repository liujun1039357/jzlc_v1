package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.ConsumerMapper;
import com.zl.pojo.Consumer;
import com.zl.service.IConsumerService;

@Service
public class ConsumerServiceImpl implements IConsumerService {
	@Autowired
	private ConsumerMapper consumerMapper;
	
	@Override
	public boolean personalLogin(String consumerName, String password){
		System.out.println("参数consumerName:"+consumerName+"参数password:"+password.length());
		Consumer consumer = consumerMapper.personalLogin(consumerName,password);
		System.out.println("login:"+consumer);
		if(consumer != null) {
			return true;
		}
		return false;
	}

}
