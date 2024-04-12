package com.javaee.spring.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javaee.spring.service.UserService;

public class UserServiceImpl implements UserService{
	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public void work() {
		// TODO Auto-generated method stub
		log.info("user service working........");
		log.error("user error....");
		System.out.println("进入UserService....");
	}
}
