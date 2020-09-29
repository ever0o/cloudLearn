package com.ever.springcloud.controller;

import com.ever.cosumer.entitys.CommonResult;
import com.ever.cosumer.entitys.PaymentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/299:03
 */
@RestController
@Slf4j
public class ConsumerController {

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Autowired
    private RestTemplate restTemplate ;

    @GetMapping("/comsumer/create")
    public CommonResult<PaymentVo> create(PaymentVo payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/savepayment",payment,CommonResult.class);
    }

    @GetMapping("/comsumer/get/{id}")
    public CommonResult<PaymentVo> getPayment(@PathVariable("id")Integer id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/selectbyid/"+id,CommonResult.class);
    }

}
