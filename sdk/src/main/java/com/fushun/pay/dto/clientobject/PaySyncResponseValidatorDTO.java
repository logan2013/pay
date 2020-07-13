package com.fushun.pay.dto.clientobject;

import com.alibaba.cola.dto.ClientObject;
import lombok.Data;

/**
 * @author wangfushun
 * @version 1.0
 * @creation 2019年01月18日23时24分
 */
@Data
public class PaySyncResponseValidatorDTO extends ClientObject {

    /**
     * 支付同步返回结果
     */
    private String responseStr;

    private String outTradeNo;
}