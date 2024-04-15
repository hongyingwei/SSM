package com.javaee.spring.action;


import com.javaee.spring.service.UserService;

public class UserAction1 {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserAction1(UserService userService) {
		this.userService = userService;
	}

	public void work() {
		this.userService.work();
	}
}
