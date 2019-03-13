package com.hehui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.irule.MySelfRule;

/**
 * 微服务消费者启动类
 * @author hehui 
 * @date 2019年2月27日
 *
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="MICROSERVICECLOUD-USER",configuration=MySelfRule.class)
@EnableFeignClients(basePackages= {"com.hehui"})
@ComponentScan("com.hehui")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
