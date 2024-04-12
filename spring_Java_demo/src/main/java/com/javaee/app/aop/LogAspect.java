package com.javaee.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// https://mkyong.com/spring3/spring-aop-aspectj-annotation-example/

@Aspect
public class LogAspect {
	@Before("execution(* com.javaee.app.*.User*.list*(..))")
	public void logBefore(JoinPoint jp) {
		System.out.println("This is Log before " + jp.getSignature());
	}
	
	@After("execution(* com.javaee.app.*.User*.list*(..))")
	public void logAfter(JoinPoint jp) {
		System.out.println("This is Log after " + jp.getSignature());
	}
	
	@Around("execution(* com.javaee.app.*.User*.list*(..))")
	public Object logAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("This is AroundLog before " + jp.getSignature());
		Object rt = jp.proceed();
		System.out.println("This is AroundLog after " + jp.getSignature());
		return rt;
	}
}
