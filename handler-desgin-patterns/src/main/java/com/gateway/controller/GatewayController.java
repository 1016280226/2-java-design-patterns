package com.gateway.controller;

import com.gateway.handler.Handler;
import com.gateway.service.impl.HandlerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandlerController {
    @Autowired
    private HandlerServiceImpl handlerServiceImpl;

    @RequestMapping("/client")
    public String client() {
//        GatewayHandler gatewayHandler = FactoryHandler.getGatewayHandler();
//        gatewayHandler.service();
        Handler firstHandler = handlerServiceImpl.getFirstHandler();
        firstHandler.handler();
        return "success";
    }
}

