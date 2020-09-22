package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/229:01
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentTowMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentTowMain.class,args);
    }
}
