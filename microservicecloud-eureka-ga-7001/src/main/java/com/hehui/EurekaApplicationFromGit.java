package com.hehui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * git配置版Eureka主启动类
 * @author hehui 
 * @date 2019年3月6日
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationFromGit {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplicationFromGit.class, args);
	}

}
