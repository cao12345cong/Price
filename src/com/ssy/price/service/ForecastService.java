package com.ssy.price.service;

import java.util.List;

import com.ssy.price.entity.Forecast;

public interface ForecastService {

	/**
	 * 
	 * 获取单品其他市场的价格列表
	 * 
	 * @param curPage
	 *            当前页
	 * @param numPage
	 *            每页多少条
	 * @param type
	 *            类型 0:默认为所有分析预测信息;1:波动预警；2：每日分析；3：深度分析；4：产品辨别
	 * @return
	 */
	public List<Forecast> findForecast(Integer curPage, Integer numPage,
			Integer type);
}
