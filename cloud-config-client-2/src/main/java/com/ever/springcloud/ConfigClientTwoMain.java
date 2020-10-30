package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/3016:13
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientTwoMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientTwoMain.class,args);
    }
}
