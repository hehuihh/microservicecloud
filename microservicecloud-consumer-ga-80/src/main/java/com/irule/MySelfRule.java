package com.irule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * Ribbon自定义配置类
 * @author hehui 
 * @date 2019年3月1日
 *
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		
		return new MyRoundRobinRule();
	}
	
}
