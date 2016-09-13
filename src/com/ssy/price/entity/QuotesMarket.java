package com.ssy.price.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class QuotesMarket extends Quotes implements Serializable {
	Integer marketid;// 市场id

	public Integer getMarketid() {
		return marketid;
	}

	public void setMarketid(Integer marketid) {
		this.marketid = marketid;
	}
}
