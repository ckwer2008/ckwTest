package com.ckw.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseBean implements Serializable {
	private static final long serialVersionUID = 1L;
	protected Date createdAt = new Date();
	protected Date updatedAt = new Date();
	protected Integer operatorId;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}
	

}
