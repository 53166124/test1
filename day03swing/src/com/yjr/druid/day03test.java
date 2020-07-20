package com.yjr.druid;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class day03test {
	public static void main(String[] args) throws Exception{
		Properties pro=new Properties();
		InputStream resourceAsStream = day03test.class.getClassLoader().getResourceAsStream("druid.properties");
		pro.load(resourceAsStream);
		String property = pro.getProperty("name");
		String password = pro.getProperty("password");
		System.out.println(property);
		System.out.println(password);
		DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
		System.out.println(dataSource.getConnection());
		Connection  connection = dataSource.getConnection();
		Statement createStatement = connection.createStatement();
		
		String sql = " select * from equip";
		ResultSet rs= createStatement.executeQuery(sql);
		while (rs.next()) {
			String name = rs.getString("name");
			String wugong = rs.getString("wugong");
			System.out.println(name+wugong);
		}
		
		connection.close();
	}
	
}
