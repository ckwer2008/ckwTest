package com.ckw.entity;

import java.util.List;

/**
 * 
 *******************************************************
 * Copyright (C) 2015 蜗居网络技术 Corporation All Rights Reserved.
 * 类名：RoleBean
 * 描述：
 * 
 * 作成时间  2015年4月20日  作成者 徐森森
 * 修改记录： 
 * 时间          修改者            説明           修改对象
 * 
 * 
 ********************************************************
 */
public class RoleBean extends BaseBean {
	
	private static final long serialVersionUID = 8128257332246335089L;
	private int id;
	private String roleName;
	private List<ActionBean> actions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

    public List<ActionBean> getActions() {
		return actions;
	}

	public void setActions(List<ActionBean> actions) {
		this.actions = actions;
	}
}
