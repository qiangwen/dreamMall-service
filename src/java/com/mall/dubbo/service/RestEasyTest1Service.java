package com.mall.dubbo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;

@Controller
@Path("/restful")
public class RestEasyTest1Service {
		
	
	@Path("/moneyAdd/{type}")
	@GET
	@Produces("application/json;charset=utf-8")
	public String moneyAdd(@PathParam("type") String type,@QueryParam("one") double money1,@QueryParam("two") double money2){
		
		String str = type + (money1+money2);
		
		return JSONObject.toJSONString(str);
	}
}
