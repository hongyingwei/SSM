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

    /**
     * 获取总积分
     * @return
     */
    double getTotal();
    
    /**
     * 获取总人民币
     * @return
     */
    double getTotalRMB();
}