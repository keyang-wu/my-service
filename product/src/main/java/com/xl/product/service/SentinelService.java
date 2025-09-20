package com.xl.product.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Component;

@Component
public class SentinelService {

  @SentinelResource("testSentinel")
  public String testSentinel() {
    return "这是对sentinel的测试";
  }

}
