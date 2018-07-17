package com.ym.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ym.dao.StuBeanMapper;
import com.ym.model.StuBean;
import com.ym.service.StuService;

@Service
public class StuServiceImpl implements StuService {

	@Resource
	private StuBeanMapper stuBeanMapper;

	@Override
	public Boolean save(StuBean stuBean) {
		if (null == stuBean.getId()) {
			return stuBeanMapper.insert(stuBean) > 0 ? true : false;
		} else {
			return stuBeanMapper.updateByPrimaryKey(stuBean) > 0 ? true : false;
		}
	}

}
