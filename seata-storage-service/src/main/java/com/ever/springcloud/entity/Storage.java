package com.ever.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/12/116:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {

    private Long id;
    private Long productId;//产品ID
    private Integer total;//总库存
    private Integer used;//已用库存
    private Integer residue;//剩余库存
}
