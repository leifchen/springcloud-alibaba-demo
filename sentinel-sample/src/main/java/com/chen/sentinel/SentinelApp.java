package com.chen.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sentinel - 服务熔断和限流
 * <p>
 * @Author LeifChen
 * @Date 2020-09-29
 */
@SpringBootApplication
public class SentinelApp {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApp.class, args);
    }

}
