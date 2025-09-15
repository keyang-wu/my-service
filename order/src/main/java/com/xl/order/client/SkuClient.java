package com.xl.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface SkuClient {

    @GetMapping("/getSKuInfo")
    String getInfo();


    @GetMapping
    String getDefault();

}
