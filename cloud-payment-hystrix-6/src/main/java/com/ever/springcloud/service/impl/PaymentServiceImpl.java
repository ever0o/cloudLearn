package com.ever.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.ever.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1417:24
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池: " +Thread.currentThread().getName()+" paymentInfo_OK,id"+id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "9000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " +Thread.currentThread().getName()+" paymentInfo_TimeOut,id"+id;
    }

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshould",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String paymentCircuitBreaker(Integer id){
        if (id < 0){
            throw new RuntimeException("*****id 不能是负数");
        }
        String number = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+":调用成功，流水号"+number;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id")Integer id){
        return "id 不能是负数，请稍后再试 id:"+id;
    }

    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池: " +Thread.currentThread().getName()+" paymentInfo_TimeoutHandler,id"+id;
    }
}