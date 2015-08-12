package com.ckw.entity;

/**
 * 
 *******************************************************
 * Copyright (C) 2015 蜗居网络技术 Corporation All Rights Reserved.
 * 类名：UserBean
 * 描述：
 * 
 * 作成时间  2015年4月20日  作成者 徐森森
 * 修改记录： 
 * 时间          修改者            説明           修改对象
 * 
 * 
 ********************************************************
 */
public class UserBean extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	private int id;
	/**
	 * 账号UID
	 */
	private Long uid;
	/**
	 * 账号用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;

    /**
     *  角色类型。用作展现
      */
    private Integer roleType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }
}