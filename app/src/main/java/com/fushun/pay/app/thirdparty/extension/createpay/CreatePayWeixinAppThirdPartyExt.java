package com.fushun.pay.app.thirdparty.extension.createpay;

import com.alibaba.cola.extension.Extension;
import com.alibaba.cola.logger.Logger;
import com.alibaba.cola.logger.LoggerFactory;
import com.fushun.pay.dto.clientobject.createpay.CreatePayWeiXinAppDTO;
import com.fushun.pay.dto.clientobject.createpay.response.CreatedPayVO;
import com.fushun.pay.app.thirdparty.extensionpoint.CreatePayThirdPartyExtPt;
import com.fushun.pay.infrastructure.common.BizCode;
import com.fushun.pay.thirdparty.weixin.pay.WeChatAppPayFacade;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangfushun
 * @version 1.0
 * @description
 * @creation 2019年02月03日00时14分
 */
@Extension(bizId = BizCode.payBizId,useCase = BizCode.payUseCase,scenario = BizCode.PAY_SCENARIO_WEIXIN_APP)
public class CreatePayWeixinAppThirdPartyExt implements CreatePayThirdPartyExtPt<CreatePayWeiXinAppDTO> {

    private Logger logger = LoggerFactory.getLogger(CreatePayWeixinAppThirdPartyExt.class);

    @Autowired
    private WeChatAppPayFacade weChatAppPayFacade;

    @Override
    public CreatedPayVO created(CreatePayWeiXinAppDTO payCO) {
        return weChatAppPayFacade.getRequest(payCO);
    }
}
