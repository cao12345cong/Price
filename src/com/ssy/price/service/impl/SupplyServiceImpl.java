package com.ssy.price.service.impl;

import java.util.List;

import com.ssy.price.commons.service.BaseService;
import com.ssy.price.entity.Supply;
import com.ssy.price.entity.SupplyProduct;
import com.ssy.price.entity.SupplyPromotion;
import com.ssy.price.service.SupplyService;

public class SupplyServiceImpl extends BaseService implements SupplyService {

	@Override
	public List<Supply> findSupply(Integer curPage, Integer numPage,
			Integer sort, Integer marketid, Integer type, String keword) {
		return null;
	}

	@Override
	public List<SupplyProduct> findSupplyProduct(Integer curPage,
			Integer numPage, Integer marketid, Integer sid) {
		return null;
	}

	@Override
	public List<SupplyPromotion> findSupplyPromotion(Integer curPage,
			Integer numPage, Integer type, Integer marketid, Integer sid) {
		return null;
	}

}
