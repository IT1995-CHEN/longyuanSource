package com.zb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.biz.EchartDataBiz;
import com.zb.entity.EchartData;
import com.zb.entity.EchartDataGroup;

@Controller
public class EchartDataC {
	
	@Autowired
	private EchartDataBiz echartDataBiz;
	
	/**
	 * 根据主键查询数据
	 * @param eid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getEchartDataById")
	public EchartData getEchartDataById(Integer eid){
		EchartData echartData = echartDataBiz.getEchartDataByEid(eid);
		System.out.println("---------------------------------------"+echartData+"-----------------------------------------");
		return echartData;
		
	}
	
	/**
	 * 获得根据传感器编号分组后的数据
	 * @param sensorId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getEchartDataGroup")
	public List<EchartDataGroup> getEchartDataGroup(){
		List<EchartDataGroup> echartDataGroupList =echartDataBiz.getEchartDataGroup();
		System.out.println("============================================================================="+echartDataGroupList.toString()+"================================================================");
		return echartDataGroupList;
		
	}
	

}
