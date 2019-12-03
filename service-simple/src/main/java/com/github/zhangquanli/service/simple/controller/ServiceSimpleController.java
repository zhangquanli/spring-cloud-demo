package com.github.zhangquanli.service.simple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/simple")
public class ServiceSimpleController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String test(
            @RequestParam(defaultValue = "zhangsan") String name
    ) {
        return "Hi " + name + ", I am from port:" + port;
    }
}
