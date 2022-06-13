package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service.impl
 * @Author: Lu Fang
 * @Date: 2022/6/10 下午 05:30
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    
    @Resource
    private PaymentDao paymentDao;
    
    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }
    
    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
    
}
