package com.zb.biz;

import java.util.List;

import com.zb.entity.HisData;
import com.zb.entity.HisDataComb;
import com.zb.util.PageUtil;

public interface HisDataBiz {
	/**
	 * 添加历史数据
	 * @param hisData
	 * @return boolean
	 */
	public boolean add(HisData hisData);
	/**
	 * 根据历史ID删除历史数据
	 * @param hisId
	 * @return boolean
	 */
	public boolean de(Integer hisId);
	/**
	 * 修改历史数据
	 * @param hisData
	 * @return boolean
	 */
	public boolean up(HisData hisData);
	/**
	 * 通过历史Id查询历史数据
	 * @param hisId
	 * @return HisDataComb
	 */
	public HisDataComb getHisDataCombById(Integer hisId);
	/**
	 * 根据传感器Id查询历史数据
	 * @param sensorId
	 * @return
	 */
	public List<HisDataComb> getHisDataBySensorId(Integer sensorId);
	/**
	 * 根据传感器Id、传感器名称、传感器设备Id分页查询历史数据
	 * @param sensorId
	 * @param sensorName
	 * @param sensorDeviceId
	 * @param index
	 * @param size
	 * @return	List<HisDataComb>
	 */
	public PageUtil<HisDataComb> getAllPage(Integer sensorId,String sensorName,Integer sensorDeviceId,PageUtil<HisDataComb> page);
	
	
}





