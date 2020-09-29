package com.ever.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/299:37
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
