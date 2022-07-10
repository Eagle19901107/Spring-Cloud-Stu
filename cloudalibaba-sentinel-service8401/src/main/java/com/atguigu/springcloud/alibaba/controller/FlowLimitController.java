package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.alibaba.controller
 * @Author: Lu Fang
 * @Date: 2022/6/27 下午 10:37
 */
@RestController
public class FlowLimitController {
    
    @GetMapping("/testA")
    public String testA(){
        return "------testA";
    }
    
    @GetMapping("/testB")
    public String testB(){
        return "------testB";
    }
    
    @GetMapping("/testD")
    public String testD(){
        //暂停几秒钟线程
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("testD 测试RT");
        return "------testD";
    }
    
    @GetMapping("/testE")
    public String testE() {
        System.out.println("testE 测试异常比例");
        int age = 10/0;
        return "------testE";
    }
    
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "dealHandler_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "------testHotKey";
    }
    
    public String dealHandler_testHotKey(String p1, String p2, BlockException exception) {
        return "-----dealHandler_testHotKey (=..=)";
    }
    
}
