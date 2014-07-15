package com.mall.dubbo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.dubbo.dao.DemoDao;
import com.mall.dubbo.entity.DemoEntity;

@Repository
public class DemoDaoImpl implements DemoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	//ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	@SuppressWarnings("unchecked")
	@Override
	public List<DemoEntity> getAll() {
		
		String hql = "from DemoEntity";
		
		return this.sessionFactory.openSession().createQuery(hql).list();
	}

	@Override
	public void addDemo(DemoEntity demo) {
		//this.sessionFactory.getCurrentSession().createSQLQuery("");
		this.sessionFactory.getCurrentSession().save(demo);
	
	}

}
