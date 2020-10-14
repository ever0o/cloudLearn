package com.ever.springcloud.controller;

import com.ever.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1417:24
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService ;



}