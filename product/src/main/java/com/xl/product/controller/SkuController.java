package com.xl.product.controller;

import com.xl.product.service.SentinelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SkuController {

  @Autowired
  private SentinelService sentinelService;

  @Value("${server.port}")
  private String port;


  @GetMapping("/getSKuInfo")
  public String getInfo() {
    log.info("product-service打印一条sku日志");
    return "这是一个测试sku" + port;
  }


  @GetMapping
  public String getDefault() {
    throw new RuntimeException("0");
  }

  @GetMapping("/helloSentinel")
  public String sentinelTest() {
    return sentinelService.testSentinel();
  }

}
