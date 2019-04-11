package com.zb.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zb.biz.HisDataBiz;
import com.zb.entity.HisData;
import com.zb.entity.HisDataComb;
import com.zb.mapper.HisDataMapper;
import com.zb.util.PageUtil;

@Service("db_nowdata")
public class HisDataBizImpl implements HisDataBiz{
	
	@Autowired
	private HisDataMapper hisDataMapper;
	
	/**
	 * 添加历史数据
	 * @param hisData
	 * @return boolean
	 */
	@Transactional
	public boolean add(HisData hisData){
		boolean f = hisDataMapper.add(hisData);
		return f;
	}
	/**
	 * 根据历史ID删除历史数据
	 * @param hisId
	 * @return boolean
	 */
	@Transactional
	public boolean de(Integer hisId){
		boolean f = hisDataMapper.de(hisId);
		return f;
	}
	/**
	 * 修改历史数据
	 * @param hisData
	 * @return boolean
	 */
	@Transactional
	public boolean up(HisData hisData){
		boolean f = hisDataMapper.up(hisData);
		return f;
	}
	/**
	 * 通过历史Id查询历史数据
	 * @param hisId
	 * @return HisDataComb
	 */
	public HisDataComb getHisDataCombById(Integer hisId){
		HisDataComb hisDataComb = hisDataMapper.getHisDataCombById(hisId);
		return hisDataComb;
	}
	/**
	 * 根据传感器Id查询历史数据
	 * @param sensorId
	 * @return
	 */
	public List<HisDataComb> getHisDataBySensorId(Integer sensorId){
		List<HisDataComb> hisDataCombs = hisDataMapper.getHisDataBySensorId(sensorId);
		return hisDataCombs;
	}
	/**
	 * 根据传感器Id、传感器名称、传感器设备Id分页查询历史数据
	 * @param sensorId
	 * @param sensorName
	 * @param sensorDeviceId
	 * @param index
	 * @param size
	 * @return	List<HisDataComb>
	 */
	public PageUtil<HisDataComb> getAllPage(Integer sensorId,String sensorName,Integer sensorDeviceId,PageUtil<HisDataComb> page){
		List<HisDataComb> hisDataCombs = hisDataMapper.getAllPage(sensorId, sensorName, sensorDeviceId, (page.getIndex()-1)*page.getSize(), page.getSize());
		page.setPage(hisDataCombs);
		int count = hisDataMapper.getAllPageCount(sensorId, sensorName, sensorDeviceId);
		page.setCount(count);
		return page;
	}
	
	
}





