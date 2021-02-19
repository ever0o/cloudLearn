package com.ever.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/116:24
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId")Long productId,@Param("count")Integer count);
}
