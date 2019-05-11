package com.strategy.mapper;

import com.strategy.entity.PaymentChannelEntity;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Calvin on 2019/5/8
 */
public interface PaymentChannelMapper {

    @Select("\n" +
            "SELECT  " +
            "id as id ,channel_name as channelName ," +
            "channel_id as channelId," +
            "strategy_bean_id AS strategyBeanId\n" +
            "FROM payment_channel " +
            "where channel_id=#{payCode}")
    public PaymentChannelEntity getPaymentChannel(String payCode);
}
