package com.ssy.price.service;

import java.util.List;

import com.ssy.price.entity.Supply;
import com.ssy.price.entity.SupplyProduct;
import com.ssy.price.entity.SupplyPromotion;

public interface SupplyService {

	/**
	 * 
	 * 获取优质供应商列表
	 * 
	 * @param curPage
	 *            当前页
	 * @param numPage
	 *            每页多少条
	 * @param sort
	 *            排序字段标识 0:默认为推荐的商家靠前，其余的则按收藏次数排列; 1:按收藏次数和评价条数综合评； 2：后台推荐商家；
	 *            3：新入驻； 4：诚信值
	 * @param marketid
	 *            市场id id为0代表获取全部市场数据
	 * @param type
	 *            商家类型 0:集团配送商;1:批发商
	 * @param keword
	 *            关键字 供应商名称
	 * @return
	 */
	public List<Supply> findSupply(Integer curPage, Integer numPage,
			Integer sort, Integer marketid, Integer type, String keword);

	/**
	 * 
	 * 获取优质供应商主营品种列表
	 * 
	 * @param curPage
	 *            当前页
	 * @param numPage
	 *            每页多少条
	 * @param marketid
	 *            市场id
	 * @param sid
	 *            供应商id
	 * @return
	 */
	public List<SupplyProduct> findSupplyProduct(Integer curPage,
			Integer numPage, Integer marketid, Integer sid);

	/**
	 * 
	 * 获取优质供应商优惠促销列表
	 * 
	 * @param curPage
	 *            当前页
	 * @param numPage
	 *            每页多少条
	 * @param type
	 *            促销类型 0:默认为当前正在促销的产品;1: 历史促销信息
	 * @param marketid
	 *            市场id
	 * @param sid
	 *            供应商id
	 * @return
	 */
	public List<SupplyPromotion> findSupplyPromotion(Integer curPage,
			Integer numPage, Integer type, Integer marketid, Integer sid);
}
