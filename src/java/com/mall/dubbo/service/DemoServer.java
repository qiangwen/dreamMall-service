package com.mall.dubbo.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.mall.dubbo.dao.DemoDao;
import com.mall.dubbo.provider.DemoService;

@Controller
@Path("/demo")
public class DemoServer {

	@Autowired
	private DemoService demoService;
	
	//private Log log = LogFactory.getLog(this.getClass());
	
	//private Logger logger = Logger.getLogger(this.getClass());
	private Logger logger = Logger.getLogger("moheader");
	@Autowired
	private DemoDao demodao;
	
	@Path("/getMsg/{msg}")
	@GET
	@Produces("application/json;charset=utf-8")
	public String getMsg(@PathParam("msg") String msg){
		/*loger.info("chenggong=================================");
		System.out.println(loger.getResourceBundleName());
		log.info("dsafffff============================================");
		log.info("dsafffff234234234============================================");
		log.info("dsafffff23423423============================================");
		log.info("dsafffffddddd============================================");
		log.info("dsafffffetertreter============================================");
		log.info("dsafffff============================================");
		log.info("dsafffff234234234============================================");
		log.info("dsafffff23423423============================================");
		log.info("dsafffffddddd============================================");
		log.info("eeeeeeeeeeeeeeeeeeeeeee============================================");
		logger.info("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVv============================================");
		System.out.println("日志成功到处");*/
		return JSONObject.toJSONString(demoService.sayMsg(msg)+"---------"+demodao.getAll().toString());
	}
}
