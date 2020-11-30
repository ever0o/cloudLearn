package com.ever.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/309:14
 */
@Configuration
@MapperScan({"com.ever.springcloud.dao"})
public class MyBatisConfig {
}
