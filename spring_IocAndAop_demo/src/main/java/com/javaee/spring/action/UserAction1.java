package com.javaee.spring.action;

import com.javaee.spring.service.UserService;
import com.javaee.spring.service.impl.UserServiceImpl;

public class UserAction1 {
	private UserService userService = new UserServiceImpl();
	
//	public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//	
//	public UserAction(UserService userService) {
//		this.userService = userService;
//	}
	
	public void work() {
		this.userService.work();
	}
}
