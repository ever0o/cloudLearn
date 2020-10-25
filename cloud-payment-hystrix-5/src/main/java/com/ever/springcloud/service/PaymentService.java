package com.ever.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1416:45
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);
    String paymentInfo_TimeOut(Integer id);
    String paymentCircuitBreaker(Integer id);
}
