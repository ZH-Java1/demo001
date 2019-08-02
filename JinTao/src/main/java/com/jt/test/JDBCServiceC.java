package com.jt.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
@Service
//自定义配置文件交给spring容器管理
@PropertySource(value = "classpath:/properties/jdbc.properties")
public class JDBCServiceC {
	@Value("get")
	private String jdbcName;
	@Value("哇哈哈哈哈")
	private String jdbcDriver;
	public String getJdbcName() {
		return jdbcName;
	}
	public void setJdbcName(String jdbcName) {
		this.jdbcName = jdbcName;
	}
	public String getJdbcDriver() {
		return jdbcDriver;
	}
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	@Override
	public String toString() {
		return "JDBCServiceC [jdbcName=" + jdbcName + ", jdbcDriver=" + jdbcDriver + "]";
	}
}
