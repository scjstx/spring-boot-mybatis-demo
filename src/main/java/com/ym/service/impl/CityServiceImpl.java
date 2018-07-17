package com.ym.service.impl;

import com.github.pagehelper.PageHelper;
import com.ym.dao.CityBeanMapper;
import com.ym.model.CityBean;
import com.ym.model.CityBeanExample;
import com.ym.model.CityBeanExample.Criteria;
import com.ym.service.CityService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private CityBeanMapper cityBeanMapper;

	@Transactional
	public Boolean save(CityBean cityBean) {
		if (null == cityBean.getCityId()) {
			return cityBeanMapper.insert(cityBean) > 0 ? true : false;
		} else {
			return cityBeanMapper.updateByPrimaryKey(cityBean) > 0 ? true : false;
		}
	}

	public CityBean findById(Short id) {
		return cityBeanMapper.selectByPrimaryKey(id);
	}

	/**
	 * 条件查询
	 */
	public List<CityBean> listPage(CityBean cityBean, Integer pageNum, Integer pageSize) {

		CityBeanExample example = new CityBeanExample();
		Criteria criteria = example.or();
		if (StringUtils.isNoneBlank(cityBean.getCity())) {
			criteria.andCityEqualTo(cityBean.getCity());
		}

		/**
		 * 采用PageHellper分页插件，只需要引入pagehelper-spring-boot-starter依赖即可
		 */
		PageHelper.startPage(pageNum, pageSize);

		return cityBeanMapper.selectByExample(example);
	}
}
