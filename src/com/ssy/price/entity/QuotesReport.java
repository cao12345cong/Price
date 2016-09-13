package com.ssy.price.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class QuotesReport implements Serializable {
	Double price;// 价格
	String pdate;// 日期
	String unit;// 单位

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
