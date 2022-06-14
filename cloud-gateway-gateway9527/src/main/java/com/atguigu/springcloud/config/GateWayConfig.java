package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @Author: Lu Fang
 * @Date: 2022/6/14 下午 02:39
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
    
    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",
                r -> r.path("/game").uri("http://news.baidu.com/game")).build();
        return routes.build();
    }
}
