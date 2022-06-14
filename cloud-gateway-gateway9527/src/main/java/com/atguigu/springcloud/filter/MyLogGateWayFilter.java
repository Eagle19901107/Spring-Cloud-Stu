package com.atguigu.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;
import java.util.Date;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.filter
 * @Author: Lu Fang
 * @Date: 2022/6/14 下午 03:27
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("come in MyLogGateWayFilter: " + new Date());
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        if (name.isEmpty()) {
            log.info("用户名为空，非法。0(Π_Π)0");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }
    
    @Override
    public int getOrder() {
        return 0;
    }
}
