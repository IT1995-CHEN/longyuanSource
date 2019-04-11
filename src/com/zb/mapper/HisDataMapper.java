package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.HisData;

@Repository
public interface HisDataMapper {
	/**
	 * 
	 * @param hisData
	 * @return boolean
	 */
	public boolean add(HisData hisData);
	/**
	 * 
	 * @param hisId
	 * @return boolean
	 */
	public boolean de(@Param("hisId")Integer hisId);
	/**
	 * 
	 * @param hisData
	 * @return boolean
	 */
	public boolean up(HisData hisData);
	/**
	 * 
	 * @param sensorId
	 * @return
	 */
	public List<HisData> getHisDataBySensorId(@Param("sensorId")Integer sensorId);
	
	
	public List<HisData> getAllPage();
	
	public List<HisData> getAllPageCount();
	
	
}




