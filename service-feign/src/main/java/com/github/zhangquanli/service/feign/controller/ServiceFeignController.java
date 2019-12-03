package com.github.zhangquanli.service.feign.controller;

import com.github.zhangquanli.service.feign.api.ServiceSimpleApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/feign")
public class ServiceFeignController {

    private ServiceSimpleApi serviceSimpleApi;

    public ServiceFeignController(ServiceSimpleApi serviceSimpleApi) {
        this.serviceSimpleApi = serviceSimpleApi;
    }

    @RequestMapping("/service_simple_test")
    public String serviceSimpleTest(
            @RequestParam(defaultValue = "zhangsan") String name
    ) {
        return serviceSimpleApi.test(name);
    }
}
