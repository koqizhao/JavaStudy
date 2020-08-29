package io.study.dubbo.starter.springboot.service;

import org.apache.dubbo.config.annotation.DubboService;

import io.study.dubbo.starter.service.HelloServiceImpl;

@DubboService(version = "${hello.service.version}")
public class SpringbootHelloServiceImpl extends HelloServiceImpl{
    
}
