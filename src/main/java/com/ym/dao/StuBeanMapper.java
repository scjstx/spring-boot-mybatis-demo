package com.ym.dao;

import com.ym.model.StuBean;
import com.ym.model.StuBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StuBeanMapper {
	long countByExample(StuBeanExample example);

	int deleteByExample(StuBeanExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(StuBean record);

	int insertSelective(StuBean record);

	List<StuBean> selectByExample(StuBeanExample example);

	StuBean selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") StuBean record, @Param("example") StuBeanExample example);

	int updateByExample(@Param("record") StuBean record, @Param("example") StuBeanExample example);

	int updateByPrimaryKeySelective(StuBean record);

	int updateByPrimaryKey(StuBean record);
}