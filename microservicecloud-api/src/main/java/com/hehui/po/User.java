package com.hehui.po;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户信息
 * @author hehui 
 * @date 2019年2月27日
 *
 */
@SuppressWarnings("serial")
@Data
@Accessors(chain=true)
public class User implements Serializable {
	
	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private String sex;
	private Integer status;
	private String db_source;
	
}
