package com.chen.dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Dubbo - 分布式服务调用：服务提供
 * <p>
 * @Author LeifChen
 * @Date 2020-09-28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class, args);
    }

}
