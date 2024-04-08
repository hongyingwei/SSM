package com.javaee.spring.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.javaee.spring.service.IPayService;
import com.javaee.spring.utils.PayCode;


@Service("IPayService")
public class IPayServiceImpl implements IPayService {

    private static double total = 10;
    private static double totalP = 100;

    @Override
    public String payByPoint(double money) {
        BigDecimal decimal = new BigDecimal(totalP);
        if (decimal.subtract(new BigDecimal(money)).compareTo(BigDecimal.ZERO) >= 0) {
            totalP = decimal.subtract(new BigDecimal(money)).floatValue();
            return PayCode.SUCCESS.getMessage();
        } else {
            return PayCode.FAIL.getMessage();
        }
    }

    @Override
    public String payRMB(double money) {
        BigDecimal decimal = new BigDecimal(total);
        if (decimal.subtract(new BigDecimal(money)).compareTo(BigDecimal.ZERO) >= 0) {
            total = decimal.subtract(new BigDecimal(money)).floatValue();
            return PayCode.SUCCESS.getMessage();
        } else {
            return PayCode.FAIL.getMessage();
        }
    }
    
    public double getTotal() {
        return total;
    }
    
    public double getTotalRMB() {
    	return totalP;
    }
}