package com.ckw.permission.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import base.BaseServiceTest;

public class RoleDaoTest extends BaseServiceTest{

	@Resource
	private RoleDao roleDao;
	
	@Test
	public void testSelectById() {
		System.err.println(roleDao.selectById(1));
		
	}

}
