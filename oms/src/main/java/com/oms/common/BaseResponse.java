package com.oms.common;

import lombok.Data;

/**
 * Created by Jelly on 2017/8/27.
 */
@Data
public abstract class BaseResponse<T> {
    private T data;
}
