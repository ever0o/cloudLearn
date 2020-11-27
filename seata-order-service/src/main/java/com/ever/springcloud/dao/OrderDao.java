package com.ever.springcloud.dao;

import com.ever.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/2614:31
 */
@Mapper
public interface OrderDao {
    void create(Order order);

    void update(@Param("userId")Long userId,@Param("status")Integer status);
}
