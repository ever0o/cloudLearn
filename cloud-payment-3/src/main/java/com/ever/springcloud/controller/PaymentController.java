package com.ever.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/2711:09
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk(){
        return "spirngcloud with zookeeper : " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
