package com.javaee.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.javaee.app.component.UserController;
import com.javaee.app.config.BeansConfig;
import com.javaee.app.entity.Person;
import com.javaee.app.entity.User;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// relative to working dir
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

		showAllBeans(context);
		
		testBeans(context);
		
		((AbstractApplicationContext) context).close();
	}

	private static void testBeans(ApplicationContext context) {
		User u = (User) context.getBean("user");
		System.out.println(u);
		
		Person jerry = (Person) context.getBean("jerry");
		System.out.println(jerry);
		
		UserController controller = (UserController) context.getBean("userController"); // myController
		controller.listAll();
	}

	private static void showAllBeans(ApplicationContext ctx) {
		// spring-aop-5.3.13/org/springframework/aop/framework/CglibAopProxy.class
		// userService--class com.jsu.app.component.UserService$$EnhancerBySpringCGLIB$$2cb6f23c
		
		String[] beans = ctx.getBeanDefinitionNames();
		System.out.println("all beans ---------");
		for (String name: beans) {
			System.out.println("    " + name + "--" + ctx.getBean(name).getClass());
		}
		System.out.println("all beans end ---------");
	}

}
