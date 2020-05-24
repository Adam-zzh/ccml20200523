package com.yqz.zzh.pojo;

import lombok.Data;

/**
 * @author zzh
 * @Description
 * @date 2020-05-24 20:33
 */
@Data
public class CommonResult<T> {

    private boolean isSuccess;

    private String msg;

    private T data;
}
