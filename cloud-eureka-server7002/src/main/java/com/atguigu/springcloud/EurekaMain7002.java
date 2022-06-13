package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @Author: Lu Fang
 * @Date: 2022/6/10 下午 11:58
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

  public static void main(String[] args) {
    //
      SpringApplication.run(EurekaMain7002.class, args);
  }
}
