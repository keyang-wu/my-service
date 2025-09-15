package com.xl.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkuController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/getSKuInfo")
    public String getInfo() {
        return "这是一个测试sku"+port;
    }


    @GetMapping
    public String getDefault() {
        throw new RuntimeException("0");
    }

}
