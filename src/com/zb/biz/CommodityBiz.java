package com.zb.biz;

import java.util.List;

import com.zb.entity.Commodity;
import com.zb.util.PageUtil;


public interface CommodityBiz {
	
	
	/*获取所有商品信息的方法*/
	public List<Commodity>  getAll();
	
	/*	产品信息唯一查询*/
	public List<Commodity> getInfoByGs(Integer gsCode);
	
	/*根据gsCode获取商品信息的方法及分页*/
	public PageUtil<Commodity> getAllPage(Integer gsCode,PageUtil<Commodity> page);
}
