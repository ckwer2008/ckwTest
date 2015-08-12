package com.ckw.permission.dao;

import com.ckw.entity.PlatformUserBean;

public interface UserDao {
	
	/**
	 * 查询用户记录
	 */
	public PlatformUserBean selectById(long id);
}
