package com.github.zhangquanli.service.feign.api;

import org.springframework.stereotype.Component;

@Component
public class ServiceSimpleApiHystrix implements ServiceSimpleApi {

    @Override
    public String test(String name) {
        return "Hi " + name + "! I am sorry. It is error.";
    }
}
