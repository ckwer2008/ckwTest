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
public class PlatformUserBean extends BaseBean {
	
	private static final long serialVersionUID = -4683639677007051764L;
	private Integer id;
	/**
	 * 账号用户名
	 */
	private String account;

	/**
	 * 密码
	 */
	private String password;
	private Integer eid;//员工Id
	private Integer cid;//客户表Customer的id
    private String nickname;
    private String avatar;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
    
}