package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1615:36
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerSixMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerSixMain.class,args);
    }
}
