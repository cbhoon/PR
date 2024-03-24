package com.ground.dto;

import java.util.Date;

public class FollowDTO {

	//Fields
	
	private int follow_id;
	private int user_id;
	private int f_user_id;
	private Date createDate = new Date(); 
	private Date updateDate = new Date();
	
	//Getters and Setters
	
	
	public int getFollow_id() {
		return follow_id;
	}
	public void setFollow_id(int follow_id) {
		this.follow_id = follow_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getF_user_id() {
		return f_user_id;
	}
	public void setF_user_id(int f_user_id) {
		this.f_user_id = f_user_id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	//toString
	
	@Override
	public String toString() {
		return "FollowDTO [follow_id=" + follow_id + ", user_id=" + user_id + ", f_user_id=" + f_user_id
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	} 
	
	
	
	
	
}
