package com.ever.springcloud.controller;

import com.ever.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1616:24
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_fallbackMethod")
public class ConsumerController {

    @Autowired
    private PaymentService paymentService ;

    @GetMapping(value = "/consumer/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_ok(id);
    }

    @GetMapping(value = "/consumer/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_timeout(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_timeout(id);
    }


    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池: " +Thread.currentThread().getName()+" paymentInfo_TimeoutHandler,id"+id;
    }

    public String payment_Global_fallbackMethod(){
        return "Global异常处理信息，请稍后再试。";
    }
}
