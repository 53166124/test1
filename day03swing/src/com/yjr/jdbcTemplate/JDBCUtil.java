package com.yjr.jdbcTemplate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JDBCUtil {
static javax.sql.DataSource dataSource;
	
	static {
		try {
			Properties pro = new Properties();
			InputStream  is = JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties");
			pro.load(is);
			dataSource = DruidDataSourceFactory.createDataSource(pro);
			
			/*ClassLoader classLoader = JDBCUtil.class.getClassLoader();
			URL resource = classLoader.getResource("druid.properties");
			String path = resource.getPath();
			properties.load(new FileInputStream(path));
			user = properties.getProperty("name");
			password = properties.getProperty("password");
			dirver = properties.getProperty("dirver");
			url = properties.getProperty("url");
			Class.forName(dirver);*/
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static javax.sql.DataSource getDataSource(){
		return (javax.sql.DataSource) dataSource;
	}
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
