package com.javaee.app.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaee.app.entity.User;

@Repository
public class UserDAO {

	public List<User> listAll() {
		List<User> users = new ArrayList<User>();
		for (int i=0; i < 10; i++) {
			users.add(new User("Zhangsan" + i, "zs" + i));
		}
		return users;
	}

}