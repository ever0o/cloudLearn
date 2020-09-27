package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/2711:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentThreeMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentThreeMain.class,args);
    }
}
