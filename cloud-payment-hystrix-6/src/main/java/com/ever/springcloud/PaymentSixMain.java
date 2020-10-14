package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1417:22
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentSixMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentSixMain.class,args);
    }
}
