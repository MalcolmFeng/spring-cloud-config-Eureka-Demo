package com.inspur.configjdbcserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Eureka Client 和 Config Server
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigJdbcServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigJdbcServerApplication.class, args);
	}

}
