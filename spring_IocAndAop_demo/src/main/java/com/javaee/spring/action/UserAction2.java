package com.javaee.spring.action;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.javaee.spring.service.UserService;

public class UserAction2 {
	private String username;
	private UserService userService;
	private List<String> someList;
	private Map<String, UserService> someMap;
	private Properties props;

	public UserAction2(String username, UserService userService) {
		this.username = username;
		System.out.println(username + ": 通过构造方法注入userService......");
		this.userService = userService;
	}

	public void setUserService(UserService userService) {
		System.err.println("通过setter方法注入userService......");
		this.userService = userService;
	}

	public void setUsername(String username) {
		System.err.println(username + "通过setter注入......");
		this.username = username;
	}

	public void setSomeList(List<String> someList) {
		System.err.println("List 通过 setter注入.....");
		this.someList = someList;
		someList.forEach(a -> {
			System.err.print(a + " ");
		});
		System.out.println();
	}

	public void setSomeMap(Map<String, UserService> someMap) {
		System.err.println("Map 通过 setter注入......");
		this.someMap = someMap;
		someMap.forEach((k, v) -> {
			System.err.println(k + " : " + v.getClass().getName());
		});
	}
	
	public void setProps(Properties props) {
		System.err.println("props 通过 setter注入......");
		props.forEach((key, value) 
				-> System.err.println(key + " = " + value));
		this.props = props;
		
	}

	public void work() {
		this.userService.work();
	}

	public Map<String, UserService> getSomeMap() {
		return someMap;
	}

	public UserService getUserService() {
		return userService;
	}

	public String getUsername() {
		return username;
	}

	public List<String> getSomeList() {
		return someList;
	}

	public Properties getProps() {
		return props;
	}	
}