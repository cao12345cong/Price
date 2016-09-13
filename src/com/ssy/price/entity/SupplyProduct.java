package com.ssy.price.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SupplyProduct implements Serializable {
	Integer spid;// 产品id
	String simgUrl;// 缩略图地址
	String spname;// 品名

	public Integer getSpid() {
		return spid;
	}

	public void setSpid(Integer spid) {
		this.spid = spid;
	}

	public String getSimgUrl() {
		return simgUrl;
	}

	public void setSimgUrl(String simgUrl) {
		this.simgUrl = simgUrl;
	}

	public String getSpname() {
		return spname;
	}

	public void setSpname(String spname) {
		this.spname = spname;
	}

}
