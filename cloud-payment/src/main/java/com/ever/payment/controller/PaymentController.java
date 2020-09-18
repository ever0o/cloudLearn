package com.ever.payment.controller;

import com.ever.payment.entitys.CommonResult;
import com.ever.payment.entitys.PaymentVo;
import com.ever.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping(value = "/payment/savpayment")
    public CommonResult savePayment(PaymentVo paymentVo){
        paymentService.savePaymentVo(paymentVo);
        log.info("插入成功");
        return new CommonResult(200,"插入成功",1);
    }

    @GetMapping(value = "/payment/selectbyid")
    public CommonResult getPaymentById(@PathVariable("id") Integer id){

        PaymentVo vo = paymentService.selectById(id);

        return new CommonResult(200,"查询成功",vo);
    }
}
