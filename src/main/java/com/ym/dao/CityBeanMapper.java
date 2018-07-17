package com.ym.dao;

import com.ym.model.CityBean;
import com.ym.model.CityBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityBeanMapper {
	long countByExample(CityBeanExample example);

	int deleteByExample(CityBeanExample example);

	int deleteByPrimaryKey(Short cityId);

	int insert(CityBean record);

	int insertSelective(CityBean record);

	List<CityBean> selectByExample(CityBeanExample example);

	CityBean selectByPrimaryKey(Short cityId);

	int updateByExampleSelective(@Param("record") CityBean record, @Param("example") CityBeanExample example);

	int updateByExample(@Param("record") CityBean record, @Param("example") CityBeanExample example);

	int updateByPrimaryKeySelective(CityBean record);

	int updateByPrimaryKey(CityBean record);
}