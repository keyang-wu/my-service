package com.xl.order.controller;

import com.xl.order.client.SkuClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkuController {

    @Autowired
    private SkuClient skuClient;

    @GetMapping("/getSKuInfo")
    public String getInfo() {
        return "外部请求:" + skuClient.getInfo();
    }

    @GetMapping
    public String getDefault() {
        return skuClient.getDefault();
    }

}
