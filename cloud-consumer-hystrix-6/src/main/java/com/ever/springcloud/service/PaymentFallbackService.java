package com.ever.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentFallbackService implements PaymentService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "-----paymentInfo_ok fall back";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "-----paymentInfo_timeout fall back";
    }
}
