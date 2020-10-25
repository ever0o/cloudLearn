package com.ever.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1616:08
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id);


}
