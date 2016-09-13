package com.ssy.price.service;

import java.util.List;

import com.ssy.price.entity.Season;

public interface SeasonService {

	/**
	 * 
	 * 获取应季农产品列表
	 * 
	 * @param curPage
	 *            当前页
	 * @param numPage
	 *            每页多少条
	 * @param keword
	 *            关键字 品种名称
	 * @param cid
	 *            类别id 0：默认全部；1：应季水果；2：应季蔬菜；3：应季水产
	 * @param startMonth
	 *            开始月份
	 * @param endMonth
	 *            结束月份
	 * @return
	 */
	public List<Season> findSeason(Integer curPage, Integer numPage,
			Integer cid, Integer startMonth, Integer endMonth, String keword);
}
