package com.chen.dubboapi;

/**
 * Dubbo API：EchoService
 * <p>
 * @Author LeifChen
 * @Date 2020-09-28
 */
public interface EchoService {

    /**
     * 打印信息
     * @param message
     * @return
     */
    String echo(String message);
}
