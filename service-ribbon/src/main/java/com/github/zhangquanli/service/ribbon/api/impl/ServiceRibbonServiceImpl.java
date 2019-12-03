package com.github.zhangquanli.service.ribbon.api.impl;

import com.github.zhangquanli.service.ribbon.api.ServiceRibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceRibbonServiceImpl implements ServiceRibbonService {

    private RestTemplate restTemplate;

    public ServiceRibbonServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "testError")
    @Override
    public String serviceSimpleTest(String name) {
        return restTemplate.getForObject("http://service-simple/service/simple/test?name=" + name, String.class);
    }

    public String testError(String name) {
        return "Hi " + name + "! I am sorry. It is error.";
    }
}
