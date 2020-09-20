package com.ever.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/1714:48
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
    }
}
