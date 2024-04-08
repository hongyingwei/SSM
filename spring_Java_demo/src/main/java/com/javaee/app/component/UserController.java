package com.javaee.app.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.javaee.app.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	public void listAll() {
		List<User> users = userService.listAll();
		
		showUsers(users);
	}

	private void showUsers(List<User> users) {
		for (User u: users) {
			System.out.println(u);
		}
	}
}
