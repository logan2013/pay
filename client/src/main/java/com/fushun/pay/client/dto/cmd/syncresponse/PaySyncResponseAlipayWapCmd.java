package com.fushun.pay.client.dto.cmd.syncresponse;

import com.fushun.pay.client.dto.PaySyncResponseCmd;
import com.fushun.pay.dto.clientobject.PaySyncResponseValidatorDTO;
import com.fushun.pay.dto.clientobject.syncresponse.PaySyncResponseAlipayWapValidatorDTO;
import lombok.Data;

/**
 * @author wangfushun
 * @version 1.0
 * @description
 * @creation 2019年01月24日01时09分
 */
@Data
public class PaySyncResponseAlipayWapCmd extends PaySyncResponseCmd {

    private PaySyncResponseAlipayWapValidatorDTO paySyncResponseAlipayWapCO;

    @Override
    public PaySyncResponseValidatorDTO getPaySyncResponseValidatorTO() {
        return paySyncResponseAlipayWapCO;
    }
}