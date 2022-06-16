package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @Author: Lu Fang
 * @Date: 2022/6/14 下午 08:59
 */
@RestController
@RefreshScope
public class ConfigClientController {
    
    @Value("${config.info}")
    private String configInfo;
    
    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
