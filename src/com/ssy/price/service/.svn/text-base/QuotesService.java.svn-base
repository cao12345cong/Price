package com.ssy.price.service;

import java.util.List;

import com.ssy.price.entity.Quotes;
import com.ssy.price.entity.QuotesMarket;
import com.ssy.price.entity.QuotesReport;

public interface QuotesService {

	/**
	 * 
	 * 获取价格行情列表
	 * 
	 * @param curPage
	 *            当前页
	 * @param numPage
	 *            每页多少条
	 * @param sort
	 *            排序字段标识 0:默认为报价日期;1:价格；2：交易量
	 * @param keyword
	 *            查询关键字 产品名称
	 * @param marketid
	 *            市场id id为0代表获取全部市场数据
	 * @param account
	 *            会员账号
	 * @return
	 */
	public List<Quotes> findQuotes(Integer curPage, Integer numPage,
			Integer sort, String keyword, Integer marketid, String account);

	/**
	 * 
	 * 获取单品近期走势图的取值
	 * 
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @param reportType
	 *            走势图类型 0:日;1:周；2:月均线 默认为一周均线
	 * @param pid
	 *            产品id
	 * @param marketid
	 *            市场id
	 * @return
	 */
	public List<QuotesReport> findQuotesReport(String startTime,
			String endTime, Integer reportType, Integer pid, Integer marketid);

	/**
	 * 
	 * 获取单品其他市场的价格列表
	 * 
	 * @param curPage
	 *            当前页
	 * @param numPage
	 *            每页多少条
	 * @param sort
	 *            排序字段标识
	 * @param pid
	 *            产品id
	 * @return
	 */
	public List<QuotesMarket> findQuotesMarket(Integer curPage,
			Integer numPage, Integer sort, Integer pid);

}
