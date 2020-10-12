package com.ever.springcloud.service;

import com.ever.cosumer.entitys.CommonResult;
import com.ever.cosumer.entitys.PaymentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1016:55
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Service
public interface PaymentService {
    @GetMapping(value = "/payment/selectbyid/{id}")
    CommonResult<PaymentVo> selectById(@PathVariable("id") Integer id);
}
