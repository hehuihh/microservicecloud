package com.hehui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hehui.po.User;
import com.hehui.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 用户模块控制层
 * @author hehui 
 * @date 2019年2月27日
 *
 */
@RestController
public class UserController {
	
	@Resource private UserService userService;
	
	@Resource private DiscoveryClient discoveryClient;

	@RequestMapping(value="/user/get",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="errorGet")
	public List<User> get(){
		List<User> list = null;
		try {
			list = userService.findAllUser();
//			int i =10/0;//模拟出现异常，触发熔断机制
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
		return list;
	}
	
	public List<User> errorGet() {
		List<User> list = new ArrayList<User>();
		list.add(new User().setId(-1));
		return list;
	}
	
	@RequestMapping(value = "/user/discovery", method = RequestMethod.GET)
	public Object discovery(){
	    List<String> list = discoveryClient.getServices();
	    System.out.println("**********" + list);
	 
	    List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
	    for (ServiceInstance element : srvList) {
	     System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
	         + element.getUri());
	    }
	    return this.discoveryClient;
	}
	
}
