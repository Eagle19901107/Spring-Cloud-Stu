package com.atguigu.springcloud.controller;

import cn.hutool.core.lang.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @Author: Lu Fang
 * @Date: 2022/6/11 下午 06:23
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    
    @RequestMapping(value = "/payment/zk")
    public String paymentZK() {
        
        return "springCloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
    
}
