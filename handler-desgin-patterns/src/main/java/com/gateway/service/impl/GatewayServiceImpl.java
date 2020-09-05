package com.gateway.service.impl;

import com.gateway.entity.GatewayHandlerEntity;
import com.gateway.handler.abstracts.Handler;
import com.gateway.mapper.HandlerMapper;
import com.gateway.service.GatewayService;
import com.gateway.utils.ContextUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Calvin on 2019/5/10
 */
@Service
public class GatewayServiceImpl implements GatewayService {

    @Autowired
    private HandlerMapper handlerMapper;

    // 处理器第二次存在内存当中
    private Handler handler;

    @Override
    public void function() {
        // 如果处理器为空，执行第一次赋值后，第二次存在内存当中
        if (handler == null) {
            // 1.从数据库中查找地址第一个处理器信息
            GatewayHandlerEntity firstHandlerEntity = handlerMapper.getFirstHandler();
            // 2.获取第一个处理器
            String handlerBeanId = firstHandlerEntity.getHandlerBeanId();
            Handler firstHandler = ContextUtils.getBean(handlerBeanId, Handler.class);
            // 3.记录当前循环handler对象
            Handler tempHandler = firstHandler;
            if(firstHandlerEntity.getNextHandlerBeanId() != null){
                // 4.获取下一个处理器beanId
                String nextHandlerBeanId = firstHandlerEntity.getNextHandlerBeanId();
                // 5. 递归
                recursive(nextHandlerBeanId, tempHandler);
            }
            handler = tempHandler;
        }
        // 6.执行处理器的所有功能。
        handler.function();
    }

    /**
     * 递归：设置下一个处理器
     *
     * @param nextHandlerBeanId 下一个处理器BeanId
     * @param tempHandler 临时处理器
     */
    private void recursive(String nextHandlerBeanId, Handler tempHandler) {
        // 处理器中的下一个处理器不为空。
        if (!StringUtils.isEmpty(nextHandlerBeanId)) {
            // 下一个处理器不为空，得到下一个处理器.
            Handler nextHandler = ContextUtils.getBean(nextHandlerBeanId, Handler.class);
            // 设置临时处理器中的下一个处理器
            tempHandler.setNextHandler(nextHandler);
            // 设置下一个nextHandlerId
            GatewayHandlerEntity nextHandlerEntity = handlerMapper.getByHandler(nextHandlerBeanId);

            if (null != nextHandlerEntity) {
                // 赋值的作用让它继续判断是否有下一个
                nextHandlerBeanId = nextHandlerEntity.getNextHandlerBeanId();
                tempHandler =  nextHandler;
                // 递归
                this.recursive(nextHandlerBeanId, tempHandler);
            }
        }
    }
}
