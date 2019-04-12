package com.zb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.biz.HisDataBiz;
import com.zb.entity.HisData;
import com.zb.entity.HisDataComb;
import com.zb.entity.NowData;
import com.zb.util.PageUtil;

@Controller
public class HisDataC {
	
	@Autowired
	private HisDataBiz hisDataBiz;
	
	/**
	 * 增加db_hisdata表数据记录
	 * @param hisData
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addHisData")
	public Map<String,String> addHisData(HisData hisData){
		boolean f = hisDataBiz.add(hisData);
		Map<String,String> map = new HashMap<String,String>();
		if(f==true){
			map.put("yes", "添加成功");
		}else{
			map.put("no", "添加失败");
		}
		return map; 
	}
	
	/**
	 * 删除db_hisdata表数据记录
	 * @param hisData
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/deHisData")
	public Map<String,String> deHisData(Integer hisId){
		boolean f = hisDataBiz.de(hisId);
		Map<String,String> map = new HashMap<String,String>();
		if(f==true){
			map.put("yes", "删除成功");
		}else{
			map.put("no", "删除失败");
		}
		return map; 
	}
	
	/**
	 * 修改db_hisdata表数据记录
	 * @param hisData
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/upHisData")
	public Map<String,String> upHisData(HisData hisData){
		boolean f = hisDataBiz.up(hisData);
		Map<String,String> map = new HashMap<String,String>();
		if(f==true){
			map.put("yes", "修改成功");
		}else{
			map.put("no", "修改失败");
		}
		return map; 
	}
	
	
	/**
	 * 根据主键查询数据
	 * @param hisId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getHisDataCombById")
	public HisDataComb getHisDataCombById(Integer hisId){
		HisDataComb hisDataComb =hisDataBiz.getHisDataCombById(hisId);
		System.out.println("---------------------------------------"+hisDataComb+"-----------------------------------------");
		return hisDataComb;
		
	}
	
	/**
	 * 根据传感器编号查询历史数据
	 * @param sensorId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getHisDataBySensorId")
	public List<HisDataComb> getHisDataBySensorId(Integer sensorId){
		List<HisDataComb> hisDataCombs =hisDataBiz.getHisDataBySensorId(sensorId);
		System.out.println("============================================================================="+hisDataCombs.size()+"================================================================");
		return hisDataCombs;
		
	}
	
	/**
	 * 获得db_hisdata中所有数据信息，分页条件查询
	 * @param sensorId
	 * @param sensorName
	 * @param sensorDeviceId
	 * @param index
	 * @param size
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllPage")
	public PageUtil<HisDataComb> getAllPage(Integer sensorId,String sensorName,Integer sensorDeviceId,
			Integer index,Integer size){
		PageUtil<HisDataComb> page = new PageUtil<HisDataComb>();
		if(index!=null&&!(index.equals(""))){
		page.setIndex(index);
		}	
		if(size!=null&&!(size.equals(""))){
			page.setSize(size);
		}		
		
		PageUtil<HisDataComb> pageUtil=hisDataBiz.getAllPage(sensorId, sensorName, sensorDeviceId, page);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+pageUtil+"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return pageUtil;
		
	}
}
