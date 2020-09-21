package com.gateway.mapper;

import com.gateway.entity.GatewayHandlerEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Calvin on 2019/5/9
 */
public interface HandlerMapper {

    /**
     * 查询第一个处理器
     *
     * @return 网管处理器实体类
     */
    @Select("SELECT " +
            "id AS id," +
            "handler_name AS handlerName," +
            "handler_bean_id AS handlerBeanId ," +
            "pre_handler_bean_id AS preHandlerBeanId ," +
            "next_handler_bean_id AS nextHandlerBeanId  " +
            "FROM gateway_handler " +
            "WHERE pre_handler_bean_id IS NULL;")
    GatewayHandlerEntity getFirstHandler();

    /**
     * 根据处理器BeanId, 查询处理器
     *
     * @param handlerBeanId 处理器BeanId
     * @return 网管处理器实体类
     */
    @Select("SELECT " +
            "id AS id," +
            "handler_name AS handlerName," +
            "handler_bean_id AS handlerBeanId ," +
            "pre_handler_bean_id AS preHandlerBeanId ," +
            "next_handler_bean_id AS nextHandlerBeanId  " +
            "FROM gateway_handler " +
            "WHERE handler_bean_id=#{handlerBeanId}")
    GatewayHandlerEntity getByHandler(@Param("handlerBeanId") String handlerBeanId);
}
