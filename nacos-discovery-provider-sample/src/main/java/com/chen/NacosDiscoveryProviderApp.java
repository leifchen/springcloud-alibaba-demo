package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务注册&发现 - 服务提供
 * <p>
 * @Author LeifChen
 * @Date 2020-09-28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryProviderApp.class, args);
    }

}
