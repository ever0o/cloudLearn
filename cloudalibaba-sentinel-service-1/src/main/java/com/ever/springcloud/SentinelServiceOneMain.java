package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/1211:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceOneMain {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceOneMain.class,args);
    }
}
