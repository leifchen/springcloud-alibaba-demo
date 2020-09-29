package com.chen.dubboconsumer;

import com.chen.dubboapi.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Dubbo - 分布式服务调用：服务消费
 * <p>
 * @Author LeifChen
 * @Date 2020-09-28
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DubboConsumerApp {

    @DubboReference
    private EchoService echoService;

    @GetMapping("/echo")
    public String echo(String message) {
        return echoService.echo(message);
    }

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApp.class, args);
    }

}
