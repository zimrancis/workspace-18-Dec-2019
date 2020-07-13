package com.cs.common.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class User{
	
	@NotBlank(message = "Name is mandatory")
	String userName;
	@NotBlank(message = "Password is mandatory")
	String password;
	@NotBlank(message = "Remark is mandatory")
	String remark;
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	
}