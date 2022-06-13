package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.lb
 * @Author: Lu Fang
 * @Date: 2022/6/12 下午 10:15
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
