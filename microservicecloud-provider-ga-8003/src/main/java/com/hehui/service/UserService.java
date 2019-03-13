package com.hehui.service;

import java.util.List;

import com.hehui.po.User;

/**
 * 用户业务逻辑
 * @author hehui 
 * @date 2019年2月27日
 *
 */
public interface UserService {
	
	List<User> findAllUser();
	
}
