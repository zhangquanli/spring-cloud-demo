package com.github.zhangquanli.service.ribbon.controller;

import com.github.zhangquanli.service.ribbon.api.ServiceRibbonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/ribbon")
public class ServiceRibbonController {

    private ServiceRibbonService serviceRibbonService;

    public ServiceRibbonController(ServiceRibbonService serviceRibbonService) {
        this.serviceRibbonService = serviceRibbonService;
    }

    @GetMapping("/service_simple_test")
    public String serviceSimpleTest(
            @RequestParam(defaultValue = "zhangsan") String name
    ) {
        return serviceRibbonService.serviceSimpleTest(name);
    }
}
