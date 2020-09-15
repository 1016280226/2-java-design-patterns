package com.computer.service;

import com.computer.abstracts.Computer;

/**
 * description: ComputerService
 * date: 2020/9/10 17:29
 * author: Calvin
 * version: 1.0
 */
public interface ComputerService {

    /**
     * 主装电脑
     *
     * @param os 操作系统
     * @return 电脑
     */
    Computer build(String os);

}
