package com.gateway.handler;

import com.gateway.handler.abstracts.Handler;
import org.springframework.stereotype.Component;

/**
 * Created by Calvin on 2019/5/9
 * 黑名单拦截处理器
 */
@Component
public class BlackListHandler extends Handler {

    @Override
    public void function() {
        System.out.println(">>>>>>>>>>> 第二关：黑名单拦截......");
        // 第二关执行第三关任务
        getNextHandler();
    }
}
