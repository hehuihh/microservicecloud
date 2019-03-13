package com.hehui.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hehui.po.User;
import com.hehui.service.UserClientService;

@RestController
public class UserController_Consumer {

//	@Resource private RestTemplate restTemplate;
	
//	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-USER";
	
	@Resource private UserClientService userClientService;
	
	@RequestMapping("/user/get")
	public List<User> get(){
		return userClientService.get();
	}
	
	/*@RequestMapping("/user/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/user/discovery", Object.class);
	}*/
	
}
