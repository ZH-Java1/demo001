package com.sms.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.sms.pojo.Wares;
import com.sms.service.WaresService;

@Controller
@RequestMapping("/")
//@RestController
public class WaresController {
	@Autowired
	private WaresService waresService;
	
	@RequestMapping("addBatch")
	public String addBatch() {
		return "goods/addbatch";//.html
	}
	@RequestMapping("loginUI")
	public String loginUI() {
		return "login";
	}
	@RequestMapping("mainUI")
	public String mainUI() {
		return "main";
	}
	@RequestMapping("mvcTest")
	//@ResponseBody
	public String mvcTest(HttpServletRequest request) {
		
		String[] s=request.getParameterValues("wares");
		System.out.println(s[0]);
	/*	//获取所有参数
        Enumeration<String> params = request.getParameterNames();
        // 测试只有一条数据
        String param =  params.nextElement();
		System.out.println(param);//对象名
	*/
		
		Wares wares=JSON.parseObject(s[0],Wares.class);
		System.out.println(wares);
		System.out.println(wares.getWareHome());
		waresService.addBatch(wares);
			
		return "login";
	}/*
	@RequestMapping("goodsInput")
	public String goodsInput() {
		return "goods/goodsinput";
	}
	*/
}
