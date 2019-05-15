package com.decorator.controller;

import com.decorator.abstracts.GatewayComponent;
import com.decorator.factory.GatewayFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Calvin
 * @Date: 2019/5/15
 * @Description:
 */
@RestController
public class GatewayController {

    @RequestMapping(value = "gateway")
    public String geteway(){
        GatewayComponent gatewayComponent = GatewayFactory.getGatewayComponent();
        gatewayComponent.service();
        return "success";
    }
}
