package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-01-27 21:17
 */
@RestController
@Slf4j
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;
    
    @Resource
    private PaymentService paymentService;
    
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****新增结果:" + result);
        
        if(result > 0)
        {
            return new CommonResult(200,"插入成功,返回结果"+result+" serverPort:"+serverPort,payment);
        }else{
            return new CommonResult(444,"插入失败",null);
        }
    }
    
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:{}",payment);
        if (payment != null) {
            return new CommonResult(200,"查询成功"+" serverPort:"+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }
    
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}


