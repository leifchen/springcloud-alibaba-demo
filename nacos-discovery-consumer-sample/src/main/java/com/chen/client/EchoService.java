package com.chen.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * OpenFeign 服务提供者声明接口
 * <p>
 * @Author LeifChen
 * @Date 2020-09-28
 */
@FeignClient("nacos-discovery-provider-sample")
public interface EchoService {

    /**
     * 打印信息
     * @param message
     * @return
     */
    @GetMapping("/echo/{message}")
    String echo(@PathVariable("message") String message);
}
