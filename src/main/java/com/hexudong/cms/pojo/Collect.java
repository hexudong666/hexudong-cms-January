package com.hexudong.cms.pojo;

import java.util.Date;

public class Collect {
	/** 文章id **/
	private Integer id;
	/** 收藏夹文本 **/
	private String text;
	/** 收藏夹地址 **/
	private String url;
	/** 添加时间 **/
	private Date created;
	/** 所属用户 **/
	private Integer user_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Collect [id=" + id + ", text=" + text + ", url=" + url + ", created=" + created + ", user_id=" + user_id
				+ "]";
	}
	
}
