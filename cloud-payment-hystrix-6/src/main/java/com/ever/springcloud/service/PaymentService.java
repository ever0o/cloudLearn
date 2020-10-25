package com.ever.springcloud.service;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1417:23
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);
    String paymentInfo_TimeOut(Integer id);
    String paymentCircuitBreaker(Integer id);
}
