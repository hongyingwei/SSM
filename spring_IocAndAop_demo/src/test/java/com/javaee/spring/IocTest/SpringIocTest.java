package com.javaee.spring.IocTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaee.spring.action.UserAction1;
import com.javaee.spring.action.UserAction2;
import com.javaee.spring.service.UserService;
import com.javaee.spring.service.impl.UserServiceImpl;

public class SpringIocTest {
	
	/**
	 * 测试打印日志功能
	 */
	@Test
	public void testlogger() {
		UserService userService = new UserServiceImpl();
		userService.work();
	}
	
	/**
	 * 测试主动创建依赖对象
	 */
	@Test
	public void testAction() {
		UserAction1 userAction = new UserAction1();
		userAction.work();
	}
	
	/**
	 * 通过spring的IOC容器构建对象和对象依赖
	 */
	@Test
    public void init() {
        ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
        UserAction2 b = act.getBean(UserAction2.class);
        b.work();
    }
	
}
