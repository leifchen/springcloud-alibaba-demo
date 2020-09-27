package com.chen;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 程序入口
 * <p>
 * @Author LeifChen
 * @Date 2020-09-27
 */
@SpringBootApplication
@RestController
@RefreshScope
public class App {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private int userAge;

    @PostConstruct
    public void init() {
        System.out.printf("[init] user name : %s , age : %d%n", userName, userAge);
    }

    @PreDestroy
    public void destroy() {
        System.out.printf("[destroy] user name : %s , age : %d%n", userName, userAge);
    }

    @GetMapping("/user")
    public String user() {
        return String.format("[HTTP] user name : %s , age : %d", userName, userAge);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
