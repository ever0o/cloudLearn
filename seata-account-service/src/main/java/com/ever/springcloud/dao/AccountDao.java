package com.ever.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/210:34
 */
@Mapper
public interface AccountDao {
    void decrease(@Param("userId")Long userId, @Param("money")BigDecimal money);
}
