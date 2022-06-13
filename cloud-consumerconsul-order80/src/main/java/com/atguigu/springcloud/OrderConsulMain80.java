package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @Author: Lu Fang
 * @Date: 2022/6/12 下午 05:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
    
    public static void main(String[] args) {
        //
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
