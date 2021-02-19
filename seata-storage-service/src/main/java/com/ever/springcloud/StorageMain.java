package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/116:14
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class StorageMain {
    public static void main(String[] args) {
        SpringApplication.run(StorageMain.class,args);
    }
}
