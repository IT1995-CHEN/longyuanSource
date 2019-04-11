package com.zb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/*获得db_nowdata中所有数据信息，分页条件查询*/
	@ResponseBody
	@RequestMapping("/getNowData")
	public PageUtil<NowData> getNowData(Integer sensorId,Integer gsCode,Integer sensorDeviceId,
			String sensorName,String area,Integer index,Integer size){
		PageUtil<NowData> page = new PageUtil<NowData>();
		if(index!=null&&!(index.equals(""))){
		page.setIndex(index);
	}	
		if(size!=null&&!(size.equals(""))){
			page.setSize(size);
		}		
		return nowDataBiz.getNowData(sensorId, gsCode, sensorDeviceId, sensorName, area, page);
		
	}
	
	/*根据主键sensorId查询数据*/
	@ResponseBody
	@RequestMapping("/getNowDataById")
	public List<NowData> getNowDataById(Integer sensorId){
		
		return nowDataBiz.getNowDataById(sensorId);
		
	}
	
	/*增加db_nowdata表数据记录*/
	@ResponseBody
	@RequestMapping("/addNowData")
	public Map<String,String> add(NowData n){
		nowDataBiz.add(n);
		Map<String, String> map = new HashMap();
		map.put("ok", "添加成功");
		return map; 
	}
	
	@ResponseBody
	@RequestMapping("/user")
	public String show(){
		return "cn";
	}
}
