package com.ever.springcloud.controller;

import com.ever.cosumer.entitys.CommonResult;
import com.ever.cosumer.entitys.PaymentVo;
import com.ever.springcloud.lb.LoadBalance;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

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

    @Autowired
    private LoadBalance loadBalance;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/comsumer/create")
    public CommonResult<PaymentVo> create(PaymentVo payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/savepayment",payment,CommonResult.class);
    }

    @GetMapping("/comsumer/get/{id}")
    public CommonResult<PaymentVo> getPayment(@PathVariable("id")Integer id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/selectbyid/"+id,CommonResult.class);
    }

    @GetMapping(value = "/consumer/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalance.instance(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }

}
