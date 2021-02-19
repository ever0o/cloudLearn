package com.ever.springcloud.service.impl;

import com.ever.springcloud.dao.AccountDao;
import com.ever.springcloud.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/210:42
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;


    @Override
    public void decrease(Long userId, BigDecimal money) {
        /*try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        accountDao.decrease(userId,money);
    }
}
