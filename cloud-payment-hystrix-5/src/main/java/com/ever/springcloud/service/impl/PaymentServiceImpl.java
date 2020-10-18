package com.ever.springcloud.service.impl;

import com.ever.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1416:47
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
            TimeUnit.SECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " +Thread.currentThread().getName()+" paymentInfo_TimeOut,id"+id;
    }

    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池: " +Thread.currentThread().getName()+" paymentInfo_TimeoutHandler,id"+id;
    }
}
