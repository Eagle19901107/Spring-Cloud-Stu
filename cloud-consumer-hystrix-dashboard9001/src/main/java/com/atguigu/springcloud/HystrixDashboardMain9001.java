package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @Author: Lu Fang
 * @Date: 2022/6/14 上午 12:22
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

  public static void main(String[] args) {
    //
      SpringApplication.run(HystrixDashboardMain9001.class, args);
  }
}
