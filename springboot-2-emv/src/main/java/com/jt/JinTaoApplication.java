package com.jt;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//1.包含了包扫描   扫描当前主启动类的包路径
//2.开启了自动配置过程
//@EnableAutoConfiguration 开启自动配置
@SpringBootApplication
public class JinTaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JinTaoApplication.class, args);
	}

}
