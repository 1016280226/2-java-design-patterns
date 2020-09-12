package com.computer.controller;

import com.computer.abstracts.Computer;
import com.computer.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: ComputerController
 * date: 2020/9/10 17:30
 * author: Calvin
 * version: 1.0
 */
@RestController
@RequestMapping("computer")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @GetMapping("build")
    public String build(@RequestParam String os) {
        Computer computer = computerService.build(os);
        return computer.toString();
    }

}
