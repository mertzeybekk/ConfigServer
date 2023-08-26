package com.mertzeybek.configservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v")
public class ConfigServiceController {
    @Value("${configdemo.count}")
    int serverVersion;

    @GetMapping("/version")
    public String getVersion() {
        return "Server version: " + serverVersion;
    }
}