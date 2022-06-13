package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.myrule
 * @Author: Lu Fang
 * @Date: 2022/6/12 下午 06:58
 */
@Configuration
public class MySelfRule {
    
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }
    
}
