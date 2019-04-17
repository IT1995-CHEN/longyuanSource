package com.zb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.biz.EchartDataBiz;
import com.zb.entity.EchartData;
import com.zb.entity.EchartDataComb;
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
		return echartData;
		
	}
		
	/**
	 * 根据电子数据的传感器id查询电子数据
	 * @param sensorId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getEchartDataBySensorId")
	public List<EchartData> getEchartDataBySensorId(Integer sensorId){
		List<EchartData> echartDatas = echartDataBiz.getEchartDataBySensorId(sensorId);
		return echartDatas;
	}
	/**
	 * 根据传感器id、电子数据日期、gsCode查询所有的电子数据
	 * @param sensorId
	 * @param today
	 * @param gsCode
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getEchartDataCombBySGT")
	public List<EchartDataComb> getEchartDataCombBySGT(Integer sensorId,String today,String gsCode){
		List<EchartDataComb> echartDataCombs = echartDataBiz.getEchartDataCombBySGT(sensorId, today, gsCode);
		return echartDataCombs;
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
		return echartDataGroupList;
		
	}
	

}
