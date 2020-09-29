package com.chen.dubboprovider.service;

import com.chen.dubboapi.EchoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * EchoService 的简单实现类
 * <p>
 * @Author LeifChen
 * @Date 2020-09-28
 */
@DubboService
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "[ECHO] " + message;
    }
}
