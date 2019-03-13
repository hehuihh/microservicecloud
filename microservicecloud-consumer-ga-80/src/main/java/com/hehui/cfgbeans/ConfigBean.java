package com.hehui.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean//该项目使用自定义iRlue，所以注释掉系统默认规则
	public IRule sysIRule() {//七中默认算法选择服务
//		return new RoundRobinRule();//轮询
//		return new RandomRule();//随机选择服务提供者
//		return new RetryRule();//轮询后过滤掉down掉的服务
//		return new BestAvailableRule();//选并发量小的服务
//		return new ZoneAvoidanceRule();//选性能好可用的服务器
//		return new WeightedResponseTimeRule();//计算权重后选择
		return new AvailabilityFilteringRule();//轮询可用的服务
	}
	
	
}
