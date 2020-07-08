package com.fushun.pay.app.dto.cmd.notify;

import com.fushun.pay.app.dto.PayNotifyCmd;
import com.fushun.pay.dto.clientobject.PayNotifyCO;
import com.fushun.pay.dto.clientobject.notify.PayNotifyWeixinAppCO;
import lombok.Data;

/**
 * @author wangfushun
 * @version 1.0
 * @description
 * @creation 2019年01月22日00时17分
 */
@Data
public class PayNotifyWeixinAppCmd extends PayNotifyCmd {

    private PayNotifyWeixinAppCO payNotifyWeixinAppCO;

    @Override
    public PayNotifyCO getPayNotifyCO() {
        return payNotifyWeixinAppCO;
    }
}
