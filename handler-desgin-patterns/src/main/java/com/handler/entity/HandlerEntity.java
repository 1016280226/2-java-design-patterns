package com.handler.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Calvin on 2019/5/9
 */
@Data
public class HandlerEntity implements Serializable, Cloneable {

    /** 主键ID **/
    private Long id;

    /** handler 处理名称 **/
    private String handlerName;

    /** handler 主键ID **/
    private String handlerId;

    /** 下一个handlerID **/
    private String nextHandlerId;
}
