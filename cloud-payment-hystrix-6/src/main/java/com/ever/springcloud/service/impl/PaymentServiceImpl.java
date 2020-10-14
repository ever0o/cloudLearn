package com.ever.springcloud.service.impl;

import com.ever.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

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

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " +Thread.currentThread().getName()+" paymentInfo_TimeOut,id"+id;
    }
}