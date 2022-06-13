package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @Author: Lu Fang
 * @Date: 2022/6/13 下午 10:36
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80 paymentInfo_OK, o(╥﹏╥)o";
    }
    
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80 paymentInfo_TimeOut, o(╥﹏╥)o";
    }
}
