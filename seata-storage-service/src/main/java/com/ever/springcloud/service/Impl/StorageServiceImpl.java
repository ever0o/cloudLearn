package com.ever.springcloud.service.Impl;

import com.ever.springcloud.dao.StorageDao;
import com.ever.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/210:20
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }
}
