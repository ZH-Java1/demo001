package com.jt.test;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix="jdbcb") //小写
public class JDBCServiceB {//批量赋值
	//规定：如果采用批量赋值的形式，一定要添加setXXX()方法
	private String jdbcName; //数据库名
	private String jdbcDriver;// 用户名
	
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
		return "JDBCServiceB [jdbcName=" + jdbcName + ", jdbcDriver=" + jdbcDriver + "]";
	}
	
}
