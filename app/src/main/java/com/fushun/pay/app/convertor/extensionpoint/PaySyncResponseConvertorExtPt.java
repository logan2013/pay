package com.fushun.pay.app.convertor.extensionpoint;

import com.alibaba.cola.context.Context;
import com.alibaba.cola.convertor.ConvertorI;
import com.alibaba.cola.extension.ExtensionPointI;
import com.fushun.pay.app.dto.clientobject.PaySyncResponseCO;
import com.fushun.pay.domain.pay.entity.PayE;

/**
 * @author wangfushun
 * @version 1.0
 * @description 支付同步返回信息
 * @creation 2019年01月22日22时32分
 */
public interface PaySyncResponseConvertorExtPt<T extends PaySyncResponseCO> extends ConvertorI, ExtensionPointI {

    public PayE clientToEntity(T paySyncResponseCO, Context context);
}
