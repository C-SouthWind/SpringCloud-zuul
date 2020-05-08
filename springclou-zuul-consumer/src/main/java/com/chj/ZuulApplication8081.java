package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：chj
 * @date ：Created in 2020/5/8 20:35
 * @params :
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication8081.class,args);
    }
}
