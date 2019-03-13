package com.hehui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 服务配置服务端主启动类
 * @author hehui 
 * @date 2019年3月6日
 *
 */
@SpringBootApplication
@EnableConfigServer
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
