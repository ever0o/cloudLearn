package com.ever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/2615:54
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardMain {
    public static void main(String[] args) {
        SpringApplication.run(DashboardMain.class,args);
    }
}
