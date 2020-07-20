package com.yjr.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yjr.bean.User;
import com.yjr.druid.JDBCUtil;

public class UserDaoImpl implements UserDao {
	
	//创建JDBCTEMPLATE对象
	JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
	
	@Override
	public List<User>findAllUser() {
		String sql = "select * from equip";
		List<User>list = jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
		return list;
	}

}
