package com.javaee.spring.service;
public interface IPayService {

    /**
     * 积分支付
     * @param money
     */
    String payByPoint(double money);

    /**
     * 人民币支付
     * @param money
     * @return
     */
    String payRMB(double money);

}