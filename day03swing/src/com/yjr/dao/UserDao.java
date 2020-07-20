package com.yjr.dao;

import java.util.List;

import com.yjr.bean.User;

public interface UserDao {
	//查询所有
	List<User>findAllUser();
	//查询一个user对象

}
