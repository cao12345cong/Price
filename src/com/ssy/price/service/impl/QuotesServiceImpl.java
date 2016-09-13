package com.ssy.price.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ssy.price.commons.service.BaseService;
import com.ssy.price.entity.Quotes;
import com.ssy.price.entity.QuotesMarket;
import com.ssy.price.entity.QuotesReport;
import com.ssy.price.service.QuotesService;

public class QuotesServiceImpl extends BaseService implements QuotesService {

	@Override
	public List<Quotes> findQuotes(Integer curPage, Integer numPage,
			Integer sort, String keyword, Integer marketid, String account) {
		List<Quotes> items = new ArrayList<Quotes>();
		Quotes quotes = new Quotes();
		quotes.setAlias("alias1");
		quotes.setPname("pname1");
		items.add(quotes);
		quotes = new Quotes();
		quotes.setAlias("alias2");
		quotes.setPname("pname2");
		items.add(quotes);
		return items;
	}

	@Override
	public List<QuotesReport> findQuotesReport(String startTime,
			String endTime, Integer reportType, Integer pid, Integer marketid) {
		return null;
	}

	@Override
	public List<QuotesMarket> findQuotesMarket(Integer curPage,
			Integer numPage, Integer sort, Integer pid) {
		return null;
	}

}
