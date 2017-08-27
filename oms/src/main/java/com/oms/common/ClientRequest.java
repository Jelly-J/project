package com.oms.common;

import lombok.Data;

/**
 * Created by Jelly on 2017/8/27.
 */
@Data
public class ClientRequest<T> extends BaseRequest<T> {

    /**
     * 客户端访问token
     */
    private String nonceToken;
}
