package com.ever.springcloud.service.impl;

import com.ever.springcloud.dao.OrderDao;
import com.ever.springcloud.entity.Order;
import com.ever.springcloud.service.AccountService;
import com.ever.springcloud.service.OrderService;
import com.ever.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/2714:32
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional(name = "fxp_tx_group",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------开始新建订单");
        orderDao.create(order);
        log.info("-----订单微服务开始调用库存，做扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("-----订单微服务开始调用账户，做扣减");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("-----修改订单的状态");
        orderDao.update(order.getUserId(),0);
        log.info("------新建订单结束");
    }
}
