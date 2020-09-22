package com.ever.springcloud.service;

import com.ever.cosumer.entitys.PaymentVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/1814:33
 */
public interface PaymentService {
    PaymentVo selectById(@Param("id") Integer id);

    void savePaymentVo(PaymentVo paymentVo);
}
