package com.ever.cosumer.controller;

import com.ever.cosumer.entitys.CommonResult;
import com.ever.cosumer.entitys.PaymentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class CosumerController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/comsumer/create")
    public CommonResult<PaymentVo> create(PaymentVo payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/savpayment",payment,CommonResult.class);
    }

    @GetMapping("/comsumer/get")
    public CommonResult<PaymentVo> getPayment(@PathVariable("id")Integer id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/selectbyid/"+id,CommonResult.class);
    }
}
