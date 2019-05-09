package com.handler.service;

import com.handler.entity.HandlerEntity;
import com.handler.handler.Handler;
import com.handler.mapper.HandlerMapper;
import com.handler.utils.ContextUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Calvin on 2019/5/10
 */
@Service
public class HandlerServiceImpl {

    @Autowired
    private HandlerMapper handlerMapper;

    private Handler handler;

    public Handler getFirstHandler(){
        // 1.从数据库中查找地址第一个handler
        HandlerEntity firstHandlerEntity = handlerMapper.getFirstHandler();
        if(firstHandlerEntity == null){
            return  null;
        }
        // 2.获取到handler任务ID 放入到spring 容器中
        String handlerId = firstHandlerEntity.getHandlerId();
        Handler firstHandler = ContextUtils.getBean(handlerId, Handler.class);

        // 3.获取下一个handler 容器beanId
        String nextHandlerId = firstHandlerEntity.getNextHandlerId();

        // 4.记录当前循环handler对象
        Handler tempHandler = firstHandler;

        // 如果为空说明是只有一个handler 对象
        while (!StringUtils.isEmpty(nextHandlerId)){

            // 5.从容器获取下一个handler对象
            Handler nextHandler = ContextUtils.getBean(nextHandlerId, Handler.class);
            tempHandler.setNextHandler(nextHandler);

            // 6.设置下一个nextHandlerId
            HandlerEntity nextHandlerEntity = handlerMapper.getByHandler(nextHandlerId);

            // 如果为空说明是最后一个
            if (nextHandlerEntity == null) {
                break;
            }
            // 赋值的作用让它继续判断是否有下一个
            nextHandlerId = nextHandlerEntity.getNextHandlerId();
            tempHandler =  nextHandler;
        }

        this.handler = firstHandler;
        return firstHandler;
    }
}
