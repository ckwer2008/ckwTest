package com.ckw.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 
 *******************************************************
 * Copyright (C) 2015 蜗居网络技术 Corporation All Rights Reserved.
 * 类名：ActionBean
 * 描述：
 * 
 * 作成时间  2015年4月20日  作成者 徐森森
 * 修改记录： 
 * 时间          修改者            説明           修改对象
 * 
 * 
 ********************************************************
 */
public class ActionBean extends BaseBean {
	
	private static final long serialVersionUID = 1326626027631150301L;
	private int id;
	/**
	 * 权限点级别(0：功能菜单，1：一级功能，2：二级功能，3：三级功能)
	 */
	private int actionLevel;
	/**
	 * 权限点URL
	 */
	private String actionUrl;
	/**
	 * 权限点描述
	 */
	private String actionDesc;

	/**
	 * 父节点id
	 */
	private Integer parentId;

	/**
	 * 只是用来标记是否有权限  1：有 2：无
	 */
	private boolean check = false;
	
	private List<ActionBean> children = new ArrayList<ActionBean>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActionUrl() {
		return actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getActionDesc() {
		return actionDesc;
	}

	public void setActionDesc(String actionDesc) {
		this.actionDesc = actionDesc;
	}

	public int getActionLevel() {
		return actionLevel;
	}

	public void setActionLevel(int actionLevel) {
		this.actionLevel = actionLevel;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<ActionBean> getChildren() {
		return children;
	}

	public void setChildren(List<ActionBean> children) {
		this.children = children;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof ActionBean)) {
			return false;
		}
		ActionBean actionBean = (ActionBean)obj;
		if(actionBean.getActionLevel() == getActionLevel()) {
			if(actionBean.getActionUrl().equals(getActionUrl())) {
				if(actionBean.getId() == getId()) {
					return true;
				}
			}
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		StringBuilder toString = new StringBuilder();
		toString.append(actionLevel).append(".");
        if(actionUrl != null) {
        	toString = toString.append(actionUrl).append(".");
        }
        return toString.toString();
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + actionLevel;
		result = 31 * result + actionUrl.hashCode();
		result = 31 * result + id;
        return result;
	}
	
	@SuppressWarnings("rawtypes")
	public static class ComparatorAction implements Comparator {
		public int compare(Object o1, Object o2) {
			ActionBean actionBean1 = (ActionBean)o1;
			ActionBean actionBean2 = (ActionBean)o2;
			return actionBean1.getActionUrl().compareTo(actionBean2.getActionUrl());
		}
	}

}
