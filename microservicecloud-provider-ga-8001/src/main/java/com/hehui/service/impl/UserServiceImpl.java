package com.hehui.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hehui.dao.UserDao;
import com.hehui.po.User;
import com.hehui.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource private UserDao userDao;
	
	@Override
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}

}
