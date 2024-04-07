package com.javaee.spring.AopTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javaee.spring.service.IPayService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class IPayServiceTest {

    @Resource
    private IPayService iPayService;

    @Test
    public void pay(){
        String result = iPayService.payByPoint(101);
        System.out.println(result);
        result = iPayService.payRMB(9);
        System.out.println(result);
    }

}