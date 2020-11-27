package com.ever.cosumer.entitys;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/1810:28
 */
@Data
public class PaymentVo implements Serializable {
    private Integer id;
    private String serial;

    public PaymentVo() {
    }

    public PaymentVo(Integer id, String serial) {
        this.id = id;
        this.serial = serial;
    }
}
