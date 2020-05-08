package com.chj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/5/8 20:31
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chj.mapper")
public class ZuulApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication8080.class,args);
    }
}
