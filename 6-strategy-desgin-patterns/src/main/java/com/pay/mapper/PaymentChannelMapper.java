package com.pay.mapper;

import com.pay.entity.PaymentChannelEntity;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Calvin on 2019/5/8
 */
public interface PaymentChannelMapper {

    /**
     * 根据支付编号，查询对应支付渠道
     * @param payCode 支付编号
     * @return 支付渠道
     */
    @Select("\n" +
            "SELECT  " +
            "id AS id," +
            "channel_name AS channelName ," +
            "channel_id AS channelId," +
            "strategy_bean_id AS strategyBeanId\n" +
            "FROM payment_channel " +
            "WHERE channel_id=#{payCode}")
    PaymentChannelEntity getPaymentChannel(String payCode);
}
