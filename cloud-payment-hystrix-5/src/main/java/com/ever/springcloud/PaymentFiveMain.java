package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1416:44
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentFiveMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentFiveMain.class,args);
    }
}
