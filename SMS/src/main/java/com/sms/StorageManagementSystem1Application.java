package com.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sms.mapper") //按照包扫描的形式为mapper接口创建代理对象
public class StorageManagementSystem1Application {

	public static void main(String[] args) {
		SpringApplication.run(StorageManagementSystem1Application.class, args);
		System.out.println("运行成功！");
	}

}
