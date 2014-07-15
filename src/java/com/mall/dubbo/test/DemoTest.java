package com.mall.dubbo.test;

import java.util.List;

import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mall.dubbo.dao.DemoDao;
import com.mall.dubbo.entity.DemoEntity;

public class DemoTest {
	ApplicationContext context = new FileSystemXmlApplicationContext(new String[]{"classpath:spring-hibernate.xml","classpath:spring-app.xml"});
	
	private DemoDao demoDao = context.getBean(DemoDao.class);
	//@Test
	public void testGetAll() {
		List<DemoEntity> list = demoDao.getAll();
		System.out.println(list.get(0).getName());
	}

	@Test
	public void addDemoTest(){
		DemoEntity demo = new DemoEntity();
		demo.setAge(34);
		demo.setName("zhoulibo");
		demoDao.addDemo(demo);
		
	}
}
