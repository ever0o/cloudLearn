package com.ever.payment.controller;

import com.ever.cosumer.entitys.CommonResult;
import com.ever.cosumer.entitys.PaymentVo;
import com.ever.payment.service.PaymentService;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/1814:35
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/savpayment")
    public CommonResult savePayment(PaymentVo paymentVo){
        paymentService.savePaymentVo(paymentVo);
        log.info("插入成功");
        return new CommonResult(200,"插入成功",1);
    }

    @GetMapping(value = "/payment/selectbyid/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id){

        PaymentVo vo = paymentService.selectById(id);
        log.info("查询成功");
        return new CommonResult(200,"查询成功:"+serverPort,vo);
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        services.forEach(i->{
            log.info(i.toString());
        });

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(i->{
            log.info(i.getServiceId()+"\t"+i.getHost()+"\t"+i.getPort()+"\t"+i.getUri());
        });
        return discoveryClient;
    }
}
