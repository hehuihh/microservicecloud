package com.hehui.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hehui.po.User;
import com.hehui.service.impl.UserClientServiceFallbackFactory;

/**
 * 通过zuul网关访问服务
 * @author hehui 
 * @date 2019年3月6日
 *
 */
@FeignClient(value="MICROSERVICECLOUD-ZUUL-GATEWAY/hehui/userService",fallbackFactory=UserClientServiceFallbackFactory.class)
public interface UserClientService {
	
	@RequestMapping("/user/get")
	public List<User> get();

}
