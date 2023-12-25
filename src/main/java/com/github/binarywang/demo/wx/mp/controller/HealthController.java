package com.github.binarywang.demo.wx.mp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author lisonghua
 * @Date 2023/12/22 11:00
 **/
@Api(tags="测试模块")
@RestController
@RequestMapping("/health")
public class HealthController {

    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public String healthCheck(){
        return "hello world";
    }
}
