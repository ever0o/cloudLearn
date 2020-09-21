package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaThreeMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaThreeMain.class,args);
    }
}
