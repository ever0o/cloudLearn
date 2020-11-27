package com.ever.cosumer.entitys;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/9/1810:29
 */
@Data
public class CommonResult<T> implements Serializable {
    private Integer resultCode;
    private String resultMsg;
    private T t;

    public CommonResult() {
    }

    public CommonResult(Integer resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public CommonResult(Integer resultCode, String resultMsg, T t) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.t = t;
    }
}
