package com.github.zhangquanli.service.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-simple", fallback = ServiceSimpleApiHystrix.class)
public interface ServiceSimpleApi {

    @GetMapping("/service/simple/test")
    String test(@RequestParam("name") String name);
}
