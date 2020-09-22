package com.ever.springcloud.dao;

import com.ever.cosumer.entitys.PaymentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/1810:31
 */
@Mapper
public interface PaymentDao {

    PaymentVo selectById(@Param("id") Integer id);

    void savePaymentVo(PaymentVo paymentVo);
}
