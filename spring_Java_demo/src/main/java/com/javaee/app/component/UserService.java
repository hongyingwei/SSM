package com.javaee.app.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaee.app.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDAO dao;
	
	public List<User> listAll() {
		return dao.listAll();
	}

}
