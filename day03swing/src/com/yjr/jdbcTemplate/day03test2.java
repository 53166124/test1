package com.yjr.jdbcTemplate;

import java.util.List;

import com.yjr.bean.User;
import com.yjr.dao.UserDao;
import com.yjr.dao.UserDaoImpl;

public class day03test2 {
	public static void main(String[] args) {
		//通过当前类调用方法
		//查询
		UserDao ud = new UserDaoImpl();
		List<User> list = ud.findAllUser();
		
		for (User user : list) {
			System.out.println(user);
		}
		
	}

}
