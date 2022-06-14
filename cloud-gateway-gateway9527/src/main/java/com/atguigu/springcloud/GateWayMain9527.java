package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @Author: Lu Fang
 * @Date: 2022/6/14 上午 10:46
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {

  public static void main(String[] args) {
    //
      SpringApplication.run(GateWayMain9527.class, args);
  }
}
