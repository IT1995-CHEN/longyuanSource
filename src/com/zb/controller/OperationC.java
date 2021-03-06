package com.zb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zb.biz.OperationBiz;
import com.zb.entity.Operation;
import com.zb.entity.OperationComb;
import com.zb.util.PageUtil;

@Controller
public class OperationC {
	
	@Autowired
	private OperationBiz operationBiz;
	
	/**
	 * 增加db_operation表数据记录
	 * @param operation
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addOperation")
	public Map<String,String> addOperation(Operation operation){
		boolean f = operationBiz.add(operation);
		Map<String,String> map = new HashMap<String,String>();
		if(f==true){
			map.put("yes", "添加成功");
		}else{
			map.put("no", "添加失败");
		}
		return map; 
	}
			
	/**
	 * 根据主键oid查询操作数据
	 * @param oid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getOperationCombById")
	public OperationComb getOperationCombById(Integer oid){
		OperationComb operationComb = operationBiz.getOperationCombById(oid);
		return operationComb;
	}
	
	/**
	 * 获取所有的操作数据
	 * @param gsCode
	 * @param operationName
	 * @param operationTime
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllOperationComb")
	public List<OperationComb> getAllOperationComb(String gsCode,String operationName,String operationTime,String fedding,String weight,String drinkWater,String bodyTemperature,String temperature,String light,String dust,String vulcanizationConcentrationSensor,String nitrogenConcentration,String feeder,String fan,String videoSwitch,String wetCurtainFilm,String farmOperation,String operator){
		List<OperationComb> operationCombs = operationBiz.getAllOperationComb(gsCode, operationName, operationTime,fedding,weight,drinkWater,bodyTemperature,temperature,light,dust,vulcanizationConcentrationSensor,nitrogenConcentration,feeder,fan,videoSwitch,wetCurtainFilm,farmOperation,operator);
		return operationCombs;
	}
	
	/**
	 * 根据gsCode编码、操作名字 、操作时间分页查询的操作数据
	 * @param gsCode
	 * @param operationName
	 * @param operationTime
	 * @param index
	 * @param size
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllOperationCombs")
	public PageUtil<OperationComb> getAllOperationCombs(String gsCode,String operationName,String beginTime,String endTime,
			Integer index,Integer size){
		long startTimeN = System.currentTimeMillis(); 
		PageUtil<OperationComb> page = new PageUtil<OperationComb>();
		if(index!=null&&!(index.equals(""))){
		page.setIndex(index);
		}	
		if(size!=null&&!(size.equals(""))){
			page.setSize(size);
		}		
		PageUtil<OperationComb> pageUtil=operationBiz.getAllPage(gsCode, operationName, beginTime, endTime, page);
		long endTimeN = System.currentTimeMillis();
		System.out.println("getAllOperationCombs：" + (endTimeN - startTimeN)/1000 + "s");    //输出程序运行时间
		return pageUtil;
		
	}
}
