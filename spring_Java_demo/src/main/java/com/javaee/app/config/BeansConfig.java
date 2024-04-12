package com.javaee.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.javaee.app.aop.LogAspect;
import com.javaee.app.entity.Person;
import com.javaee.app.entity.User;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.javaee.app.component")
public class BeansConfig {
//	@Bean
//	public User user() {
//		User u = new User("iamtom", "Tom");
//		u.setPerson(jerry());
//		return u;
//	}
	
	@Bean
	public User user() {
		return new User("iamtom", "Tom", "Tom Smith", "tom@cat.com");
	}
	
	@Bean
	public Person jerry() {
		Person p = new Person();
		p.setName("Jerry");
		p.setEmail("dontknow@where.com");
		
		return p;
	}
	
	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}
}
