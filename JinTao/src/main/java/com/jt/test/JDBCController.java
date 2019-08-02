package com.jt.test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

//@Controller + @ResponseBody
@RestController
public class JDBCController {
	@Autowired
	private JDBCConnectionService jdbcService;
	@Autowired
	private JDBCServiceB jdbcServiceB;
	@Autowired
	private JDBCServiceC jdbcServiceC;
	/**
	 * 对象转化JSON串时调用getXXX()方法
	 * @return
	 */
	//获取数据检查赋值是否正常
	@RequestMapping("/jdbcTest")
	public JDBCConnectionService jdbcTest() {
		System.out.println(jdbcService);
		return jdbcService;
	}
	//2.测试批量赋值操作
	@RequestMapping("/jdbcTestB")
	public JDBCServiceB jdbcTestB() {
		System.out.println(jdbcServiceB);
		return jdbcServiceB;
	}
	//3.
	@RequestMapping("/jdbcTestC")
	public JDBCServiceC jdbcTestC() {
		 System.out.println(jdbcServiceC);
		 return jdbcServiceC;
	 }
}
