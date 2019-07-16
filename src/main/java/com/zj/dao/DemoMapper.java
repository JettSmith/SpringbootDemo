package com.zj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zj.bean.Demo;

@Mapper
//@Repository
public interface DemoMapper {
	
	List<Demo> findAll();
	
}
