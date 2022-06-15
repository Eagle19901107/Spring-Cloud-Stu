package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @Author: Lu Fang
 * @Date: 2022/6/15 下午 02:39
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;
    
    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return iMessageProvider.send();
    }
}
