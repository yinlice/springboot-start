package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {
	@Value(value = "${username}")
	private String usrName;
	@Value(value ="${password}")
	private String password;


	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public IMoocJSONResult getUserJson() {
		
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		u.setDesc("hello imooc~~hello imooc~~");
		
		return IMoocJSONResult.ok(u);
	}
	@RequestMapping("/testValue")
	public Object testValue(){
		return usrName+password;
	}
}
