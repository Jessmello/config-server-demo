package com.example.client.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class DemoController {
    @Value("${test.url}")
    private String urlTest;

    @GetMapping("/test-url")
    public String getUrlTest(){
        return urlTest;
    }
}