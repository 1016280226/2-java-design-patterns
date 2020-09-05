package com.handler.mapper;

import com.handler.entity.HandlerEntity;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Calvin on 2019/5/9
 */
public interface HandlerMapper {

    @Select("SELECT  handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid  FROM handler WHERE  prev_handler_id is null;")
    public HandlerEntity getFirstHandler();

    @Select("SELECT  handler_name AS handlerName,handler_id AS handlerid ,prev_handler_id AS prevhandlerid ,next_handler_id AS nexthandlerid   FROM handler WHERE  handler_id=#{handlerId}")
    public HandlerEntity getByHandler(String handlerId);
}
