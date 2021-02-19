package com.ever.springcloud.controller;

import com.ever.springcloud.entity.CommonResult;
import com.ever.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/210:43
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService ;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功");
    }

}
