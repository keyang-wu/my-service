package com.xl.order.controller;

import com.xl.order.client.SkuClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SkuController {

    @Autowired
    private SkuClient skuClient;

    @GetMapping("/getSKuInfo")
    public String getInfo() {
        log.info("order-service打印一条sku日志");
        return "外部请求:" + skuClient.getInfo();
    }

    @GetMapping
    public String getDefault() {
        return skuClient.getDefault();
    }

}
