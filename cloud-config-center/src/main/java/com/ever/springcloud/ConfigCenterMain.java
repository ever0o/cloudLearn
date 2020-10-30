package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/309:11
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain.class,args);
    }
}
