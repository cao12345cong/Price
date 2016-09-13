package com.ssy.price.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Supply implements Serializable {
	Integer sid;// 供应商id
	String simgUrl;// 缩略图地址
	String products;// 主营品种
	String phone;// 联系电话
	String mobile;// 手机号码
	Integer fCount;// 收藏次数
	Integer cCount;// 评论次数
	String stallNum;// 档位号
	String address;// 地址
	Integer isCommend;// 是否推荐 0:为被推荐;1:被推荐
	Integer isRemark;// 是否备案 0:未备案;1:已备案
	Integer level;// 诚信级别 以数字区分级别，具体待定
	String shopUrl;// 网店地址

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSimgUrl() {
		return simgUrl;
	}

	public void setSimgUrl(String simgUrl) {
		this.simgUrl = simgUrl;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getfCount() {
		return fCount;
	}

	public void setfCount(Integer fCount) {
		this.fCount = fCount;
	}

	public Integer getcCount() {
		return cCount;
	}

	public void setcCount(Integer cCount) {
		this.cCount = cCount;
	}

	public String getStallNum() {
		return stallNum;
	}

	public void setStallNum(String stallNum) {
		this.stallNum = stallNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIsCommend() {
		return isCommend;
	}

	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}

	public Integer getIsRemark() {
		return isRemark;
	}

	public void setIsRemark(Integer isRemark) {
		this.isRemark = isRemark;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getShopUrl() {
		return shopUrl;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}
}
