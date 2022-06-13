package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @Author: Lu Fang
 * @Date: 2022/6/12 下午 05:26
 */
@RestController
@Slf4j
public class PaymentController {
    
    @Value("${server.port}")
    private String serverPort;
    
    @RequestMapping(value = "/payment/consul")
    public String paymentConsul()
    {
        return "springCloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
