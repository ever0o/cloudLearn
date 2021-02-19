package com.ever.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/210:41
 */
public interface AccountService {
    void decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money);
}
