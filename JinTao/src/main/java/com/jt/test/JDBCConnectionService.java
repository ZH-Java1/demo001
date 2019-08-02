package com.jt.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JDBCConnectionService {
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.driverName}")
	private String driverName; //数据库名
	@Value("${jdbc.username}")
	private String username;// 用户名
	
	public String getUrl() {
		return url;
	}

	public String getDriverName() {
		return driverName;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "JDBCConnectionService [url=" + url + ", driverName=" + driverName + ", username=" + username + "]";
	}
	
}
