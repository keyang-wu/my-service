package com.xl.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {

    @Value("${hh}")
    private String val;

    @Value("${dd}")
    private String ext;


    @GetMapping("/default")
    public String getDefault() {
        return val;
    }

    @GetMapping("/ext")
    public String getExt() {
        return ext;
    }


    @GetMapping
    public String get() {
        log.info("order-service 打印一条 hello 日志");
        return "hh";
    }


}
