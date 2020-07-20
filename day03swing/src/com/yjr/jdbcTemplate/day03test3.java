package com.yjr.jdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yjr.bean.User;

public class day03test3 {
	public static void main(String[] args) {
		//查询
		/*JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		String sql = "select * from equip";
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		for (User user : list) {
			System.out.println(user);
		}*/
		
		//增加方法
		/*JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		String sql="insert into equip(name,wugong,leval)values('太极天帝剑',1162,100)";
		int update = jt.update(sql);
		System.out.println("新增"+update+"方法");*/
		
		//添加预编译
		/*JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		String sql="insert into equip(name,wugong,leval)values(?,?,?)";
		int update = jt.update(sql,"赤光剑",1143,100);
		System.out.println("新增"+update+"方法");*/
		
		//修改
		/*JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		int update = jt.update("update equip set name = ?,wugong = ?,leval = ? where id = 3","军神神话耳环",169,100);
		System.out.println("修改"+update+"方法");*/
		
		//根据id删除
		/*JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		int update = jt.update("delete from equip where id = ?",3);
		System.out.println("根据id删除"+update+"方法");*/
		
		//根据姓名删除
		/*JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		int update = jt.update("delete from equip where name = ?","赤光剑");
		System.out.println("根据id删除"+update+"方法");*/
		
		//查询单个信息
		/*JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		List<User>list = jt.query("select * from equip where id = 1",new BeanPropertyRowMapper<User>(User.class));
		System.out.println(list);*/
		
		//查询所有信息
		JdbcTemplate jt = new JdbcTemplate(JDBCUtil.getDataSource());
		String sql = "select * from equip";
		List<User>list = jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
		for(User user : list) {
			System.out.println(user);
		}
		
		}
	}
