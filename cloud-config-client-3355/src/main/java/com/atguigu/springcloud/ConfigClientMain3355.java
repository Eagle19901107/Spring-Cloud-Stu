package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @Author: Lu Fang
 * @Date: 2022/6/14 下午 08:56
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
    
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class,args);
    }
}
