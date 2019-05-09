package com.strategy.mapper;

import com.strategy.entity.PaymentChannelEntity;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Calvin on 2019/5/8
 */
public interface PaymentChannelMapper {

    @Select("\n" +
            "SELECT  " +
            "id as id ,CHANNEL_NAME as CHANNELNAME ," +
            "CHANNEL_ID as CHANNELID," +
            "strategy_bean_id AS strategybeanid\n" +
            "FROM payment_channel " +
            "where CHANNEL_ID=#{payCode}")
    public PaymentChannelEntity getPaymentChannel(String payCode);
}
