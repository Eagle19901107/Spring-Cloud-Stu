package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @Author: Lu Fang
 * @Date: 2022/6/12 下午 05:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

      public static void main(String[] args) {
        //
          SpringApplication.run(PaymentMain8006.class, args);
      }
}
