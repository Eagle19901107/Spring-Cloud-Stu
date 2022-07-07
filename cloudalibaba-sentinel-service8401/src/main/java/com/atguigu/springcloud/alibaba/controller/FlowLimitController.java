package com.atguigu.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.controller
 * @Author: Lu Fang
 * @Date: 2022/6/27 下午 10:37
 */
@RestController
public class FlowLimitController {
    
    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }
    
    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }
    
}
