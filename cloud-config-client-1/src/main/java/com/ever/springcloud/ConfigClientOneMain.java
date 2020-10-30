package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/3011:37
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientOneMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientOneMain.class,args);
    }
}
