package com.github.zhangquanli.service.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSimpleApplication.class, args);
    }
}
