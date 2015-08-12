package com.ckw.permission.dao;

import javax.annotation.Resource;

import org.junit.Test;

import base.BaseServiceTest;

public class UserDaoTest extends BaseServiceTest{
	
	@Resource
	private UserDao userDao;

	@Test
	public void testSelectById() {
		
		System.err.println(userDao.selectById(381l));
	}

}
