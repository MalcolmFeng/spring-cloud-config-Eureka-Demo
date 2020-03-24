package com.inspur.eurekacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaCenterApplication {

	// 启动后访问： http://localhost:3000/ 查看所有注册到注册中心的服务。
	public static void main(String[] args) {
		SpringApplication.run(EurekaCenterApplication.class, args);
	}

}
