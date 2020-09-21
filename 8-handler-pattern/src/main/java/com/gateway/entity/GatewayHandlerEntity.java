package com.gateway.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Calvin on 2019/5/9
 */
@Data
public class GatewayHandlerEntity implements Serializable, Cloneable {

    /** 主键ID **/
    private Long id;

    /** 处理器名称 **/
    private String handlerName;

    /** 处理器BeanID **/
    private String handlerBeanId;

    /** 下一个处理器BeanID **/
    private String nextHandlerBeanId;

    /** 上一个处理器BeanID **/
    private String preHandlerBeanId;
}
