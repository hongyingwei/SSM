package com.javaee.spring.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.javaee.spring.service.IPayService;

public class LoggerAdvice {

    private static final Logger LOGGER = Logger.getLogger(LoggerAdvice.class);

    public void before(JoinPoint joinPoint) {
    	Object targetObject = joinPoint.getTarget();//得到目标对象
    	IPayService payService = null;
    	if(targetObject instanceof IPayService) {
    		payService = (IPayService) targetObject;
    	}
    	
        System.err.println("在方法执行之前执行总积分: " + (payService == null ? 0:payService.getTotal()));
        System.out.println("在方法执行之前执行总人民币: " + (payService == null ? 0:payService.getTotalRMB()));
    }

    public void after(JoinPoint joinPoint) {
        System.err.println("在方法执行之后执行");
        System.out.println("切面执行的方法名称：" + joinPoint.getSignature().getName());
    }

    /**
     * 回调函数
     */
    public Object around(ProceedingJoinPoint joinPoint) {
		/*
		joinPoint.getArgs();//得到实际参数
		joinPoint.getTarget();//得到目标对象
		joinPoint.getSignature();//得到方法签名
		*/
        try {
            //记录支付多少钱
            Object money = joinPoint.getArgs()[0];
            Object result = joinPoint.proceed();//完成目标对象方法的调用
            //支付成功
            LOGGER.info("支付了：" + money + "  结果为：" + result);

            return "增强后的结果：" + result;
        } catch (Throwable e) {
            LOGGER.info("支付失败" + e.getMessage());
        }
        return null;
    }
}