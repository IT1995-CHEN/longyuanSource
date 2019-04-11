package com.zb.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zb.biz.CommodityBiz;
import com.zb.entity.Commodity;
import com.zb.mapper.CommodityMapper;
import com.zb.util.PageUtil;

@Service("db_commodity")
public class CommodityBizImpl implements CommodityBiz {

	@Autowired
	private CommodityMapper commodityMapper;

	@Override
	public List<Commodity> getAll() {
		// TODO Auto-generated method stub
		return commodityMapper.getAll();
	}
	@Override
	public PageUtil<Commodity> getAllPage(Integer gsCode,
			PageUtil<Commodity> page) {
		// TODO Auto-generated method stub
		List<Commodity> clist = commodityMapper.getAllPage(gsCode,(page.getIndex() - 1) * page.getSize(), page.getSize());
		page.setPage(clist);
		
		int count = commodityMapper.getAllPageCount(gsCode);
		page.setCount(count);
		return page;
	}


	


	


}
