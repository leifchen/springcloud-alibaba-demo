package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务注册&发现 - 服务订阅
 * <p>
 * @Author LeifChen
 * @Date 2020-09-28
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosDiscoveryConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerApp.class, args);
    }

}
