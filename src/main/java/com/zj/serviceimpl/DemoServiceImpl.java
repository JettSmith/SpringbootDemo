package com.zj.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zj.bean.Demo;
import com.zj.dao.DemoMapper;
import com.zj.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoMapper demoMapper;
	@Override
	public List<Demo> findAll() {
		List<Demo> list = demoMapper.findAll();
		return list;
	}

}
