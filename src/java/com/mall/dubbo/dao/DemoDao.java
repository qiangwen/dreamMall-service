package com.mall.dubbo.dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mall.dubbo.entity.DemoEntity;

@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
public interface DemoDao {

	public abstract List<DemoEntity> getAll();
	
	public abstract void addDemo(DemoEntity demo);
}
