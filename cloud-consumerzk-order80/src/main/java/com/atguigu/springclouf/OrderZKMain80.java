package com.atguigu.springclouf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springclouf
 * @Author: Lu Fang
 * @Date: 2022/6/12 下午 04:45
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class OrderZKMain80 {
      public static void main(String[] args) {
        //
          SpringApplication.run(OrderZKMain80.class, args);
      }
}
