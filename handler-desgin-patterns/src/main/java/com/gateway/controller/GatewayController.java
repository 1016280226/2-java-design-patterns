package com.gateway.controller;

import com.gateway.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "gateway")
public class GatewayController {

    @Autowired
    private GatewayService gatewayService;

    @GetMapping("/api")
    public String api() {
      gatewayService.function();
      return "success";
    }
}

