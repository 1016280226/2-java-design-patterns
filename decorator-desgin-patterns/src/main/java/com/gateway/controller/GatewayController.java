package com.gateway.controller;

import com.gateway.component.abstracts.GatewayComponent;
import com.gateway.component.factory.GatewayFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:
 */
@RestController
@RequestMapping("gateway")
public class GatewayController {

    @GetMapping(value = "api")
    public String api(){
        GatewayComponent gatewayComponent = GatewayFactory.getGatewayComponent();
        gatewayComponent.function();
        return "success";
    }
}
