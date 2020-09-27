package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/2715:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerTwoMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerTwoMain.class,args);
    }
}
