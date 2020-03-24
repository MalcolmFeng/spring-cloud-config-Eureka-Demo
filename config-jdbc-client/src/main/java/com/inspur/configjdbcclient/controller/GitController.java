package com.inspur.configjdbcclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 修改配置文件内容后，不会自动刷新，它提供了一个刷新机制，但是需要我们主动触发。
// 1.需要引入spring-boot-starter-actuator 包
// 2.需要在 config client 端配置中增加 actuator 配置：
//management:
//  endpoint:
//    shutdown:
//      enabled: false
//  endpoints:
//    web:
//      exposure:
//        include: "*"
@RefreshScope
@RestController
public class GitController {

    // 启动后访问 注意端口不是 12345
    // http://localhost:8083/show
    // http://localhost:8083/autoShow
    //
    // 刷新配置文件： http://localhost:8083/actuator/refresh

    @Value("${foo}")
    String foo;

    @GetMapping(value = "show")
    public Object show(){
        return foo;
    }
    @GetMapping(value = "autoShow")
    public Object autoShow(){
        return foo;
    }

}

