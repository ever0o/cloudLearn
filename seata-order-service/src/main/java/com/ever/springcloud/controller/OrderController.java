package com.ever.springcloud.controller;

import com.ever.springcloud.entity.CommonResult;
import com.ever.springcloud.entity.Order;
import com.ever.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/309:06
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
