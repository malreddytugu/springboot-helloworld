package com.javalearning.springboot.helloworld.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile(value= {"dev","!dev"})
public class DbConfig {

	@Value("${db.driverClass:com.oracle.driver.OracleDriver}")
	private String driverClass;
	
	@Value("${db.url:jdbc:oracle:thin:@localhost:1521:XE}")
	private String url;
	
	@Value("${db.username:admin}")
	private String username;
	
	@Value("${db.password:admin}")
	private String password;

	@Override
	public String toString() {
		return "DbConfig [driverClass=" + driverClass + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
}
