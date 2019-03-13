package com.hehui.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hehui.po.User;
import com.hehui.service.UserClientService;

import feign.hystrix.FallbackFactory;

/**
 * 服务调用失败，熔断机制，杜绝扇出，防止雪崩效应
 * @author hehui 
 * @date 2019年3月4日
 *
 */
@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {

	//服务调用失败，该方法被调用兜底
	@Override
	public UserClientService create(Throwable cause) {
		return new UserClientService() {
			@Override
			public List<User> get() {
				List<User> list = new ArrayList<User>();
				list.add(new User().setId(-1));
				return list;
			}
		};
	}


}
