package com.ever.springcloud.controller;

import com.ever.cosumer.entitys.CommonResult;
import com.ever.cosumer.entitys.PaymentVo;
import com.ever.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/916:39
 */
@RestController
public class ConsumerController {
     @Autowired
     private PaymentService paymentService;

     @GetMapping(value = "/consumer/get/{id}")
     public CommonResult<PaymentVo> getpaymentById(@PathVariable("id")Integer id){
         return paymentService.selectById(id);
     }
}
