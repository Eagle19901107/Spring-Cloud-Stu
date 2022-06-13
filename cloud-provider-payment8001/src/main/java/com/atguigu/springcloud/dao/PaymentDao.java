package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.dao
 * @Author: Lu Fang
 * @Date: 2022/6/10 16:55
 */
@Mapper
//@Repository
public interface PaymentDao
{
    public int create(Payment payment);
    
    public Payment getPaymentById(@Param("id") Long id);
}
