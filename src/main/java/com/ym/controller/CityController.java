package com.ym.controller;

import com.ym.model.CityBean;
import com.ym.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/city")
public class CityController {

  @Autowired
  private CityService cityService;

  @ResponseBody
  @RequestMapping("/detail/{id}")
  public CityBean findById(@PathVariable Short id) {
    return cityService.findById(id);
  }

}
