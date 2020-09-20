package com.ever.payment.service.impl;

import com.ever.cosumer.entitys.PaymentVo;
import com.ever.payment.dao.PaymentDao;
import com.ever.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/1814:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public PaymentVo selectById(Integer id) {
        return paymentDao.selectById(id);
    }

    @Override
    public void savePaymentVo(PaymentVo paymentVo) {
        paymentDao.savePaymentVo(paymentVo);
    }
}
