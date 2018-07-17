package com.ym.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ym.model.StuBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StuServiceTest {


	@Autowired
	private StuService stuService;

	@Test
	public void save() {
		StuBean stu = new StuBean();
		stu.setAge(18d);
		stu.setName("名字");
		stuService.save(stu);
	}
}
