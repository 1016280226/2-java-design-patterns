package com.gateway.handler;

import com.gateway.handler.abstracts.Handler;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/9
 * API接口限流处理器
 */
@Component
public class ApiCurrentLimitHandler extends Handler {

    @Override
    public void function() {
        System.out.println(">>>>>>>>>>> 第一关：API接口限流......");
        // 第一关执行完毕执行第二关
        getNextHandler();
    }
}
