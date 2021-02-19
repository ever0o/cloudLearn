package com.ever.springcloud.service;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/210:19
 */
public interface StorageService {
    void decrease(Long productId , Integer count);
}
