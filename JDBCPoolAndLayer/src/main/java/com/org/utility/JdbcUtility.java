package com.org.utility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtility {

	public static Connection getConnection()throws Exception {

		ComboPooledDataSource ds = new ComboPooledDataSource();
		// read connection property from property file
		
			Properties prop = new Properties();
			FileInputStream in = new FileInputStream("src/main/java/com/org/props/jdbc.properties");
			prop.load(in);
			ds.setJdbcUrl(prop.getProperty("jdbc.url"));
			ds.setUser(prop.getProperty("jdbc.user"));
			ds.setPassword(prop.getProperty("jdbc.password"));
			ds.setDriverClass(prop.getProperty("jdbc.class"));

		
		return ds.getConnection();
	}

}
