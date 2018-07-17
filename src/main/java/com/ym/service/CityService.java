package com.ym.service;

import com.ym.model.CityBean;
import java.util.List;

public interface CityService {

  /**
   * 保存
   */
  Boolean save(CityBean cityBean);

  /**
   * 按照ID获取
   */
  CityBean findById(Short id);


  /**
   * 分页查询
   *
   * @param cityBean 查询条件
   * @param pageNum 页码
   * @param pageSize 每页记录数
   * @return 查询结果
   */
  List<CityBean> listPage(CityBean cityBean, Integer pageNum, Integer pageSize);
}
