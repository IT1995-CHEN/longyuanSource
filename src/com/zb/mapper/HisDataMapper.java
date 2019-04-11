package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.zb.entity.HisData;
import com.zb.entity.HisDataComb;

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
	
	
	public List<HisDataComb> getAllPage(@Param("sensorId")Integer sensorId,@Param("sensorName")String sensorName,@Param("index")Integer index,@Param("size")Integer size);
	
	public List<HisDataComb> getAllPageCount(@Param("sensorId")Integer sensorId,@Param("sensorName")String sensorName);
	
	
}





