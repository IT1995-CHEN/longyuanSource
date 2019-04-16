package com.zb.biz;

import java.util.List;

import com.zb.entity.Commodity;
import com.zb.util.PageUtil;


public interface CommodityBiz {
		
	/**
	 * 获取所有商品信息的方法
	 * @param
	 * @return list
	 */
	public List<Commodity>  getAll();
	
	/**
	 * 	产品信息唯一查询
	 * @param gsCode
	 * @return list
	 */
	public List<Commodity> getInfoByGs(String gsCode);
	
	/**
	 * 根据gsCode获取商品信息的方法及分页
	 * @param gsCode page
	 * @return PageUtil<Commodity>
	*/
	public PageUtil<Commodity> getAllPage(String gsCode,PageUtil<Commodity> page);
}
