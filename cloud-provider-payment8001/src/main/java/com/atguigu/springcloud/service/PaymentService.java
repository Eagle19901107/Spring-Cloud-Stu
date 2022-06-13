package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @Author: Lu Fang
 * @Date: 2022/6/10 下午 05:29
 */
public interface PaymentService
{
    public int create(Payment payment);
    
    public Payment getPaymentById(@Param("id") Long id);
    
}
