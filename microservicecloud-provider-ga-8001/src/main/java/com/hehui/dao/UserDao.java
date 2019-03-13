package com.hehui.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hehui.po.User;

/**
 * 用户DAO
 * @author hehui 
 * @date 2019年2月27日
 *
 */
@Mapper
public interface UserDao {

	List<User> findAllUser();
	
}
