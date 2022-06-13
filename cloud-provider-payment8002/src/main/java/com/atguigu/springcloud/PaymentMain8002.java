package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @Author: Lu Fang
 * @Date: 2022/6/10 15:57
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    
      public static void main(String[] args) {
            //
            SpringApplication.run(PaymentMain8002.class, args);
      }
}
