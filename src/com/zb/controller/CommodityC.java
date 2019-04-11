package com.zb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.biz.CommodityBiz;
import com.zb.entity.Commodity;
import com.zb.util.PageUtil;

@Controller
public class CommodityC {

@Autowired
private CommodityBiz commodityBiz;

/*获得所有商品信息*/
@ResponseBody
@RequestMapping("getAllCommodity")
public List<Commodity> getAll(){
	System.out.println('1');
	return commodityBiz.getAll();
}

/*分页条件查询获得商品信息*/
@ResponseBody
@RequestMapping("getAllCommodityByPage")
public PageUtil<Commodity> getAllByPage(Integer gsCode){
	PageUtil<Commodity> page=new PageUtil<Commodity>();
//	if(index!=null&&!(index.equals(""))){
//		page.setIndex(index);
//	}
	
	return commodityBiz.getAllPage(gsCode, page);
}
}
