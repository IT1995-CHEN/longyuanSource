package com.zb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.biz.NowDataBiz;
import com.zb.entity.NowData;
import com.zb.util.PageUtil;

@Controller
public class NowDataC {

	@Autowired
	private NowDataBiz nowDataBiz;
	@ResponseBody
	@RequestMapping("/getNowData")
	public PageUtil<NowData> getNowData(Integer sensorId,Integer gsCode,Integer sensorDeviceId,
			String sensorName,String area,Integer index,Integer size){
		PageUtil<NowData> page = new PageUtil<NowData>();
//		if(index!=null&&!(index.equals(""))){
//		page.setIndex(index);
//	}		
		return nowDataBiz.getNowData(sensorId, gsCode, sensorDeviceId, sensorName, area, page);
		
	}
	
}
