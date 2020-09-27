package com.ever.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/2715:13
 */
@RestController
@Slf4j
public class ConsumerController {

    public static final String INVOICE_URL= "http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/zk")
    public String getpaymentInfo(){
        String result = restTemplate.getForObject(INVOICE_URL+"/payment/zk",String.class);
        return result;
    }

}
