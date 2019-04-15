package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.EchartData;

@Repository
public interface EchartDataMapper {
	/**
	 * 根据电子数据的id查询电子数据
	 * @param eid
	 * @return
	 */
	public EchartData getEchartDataByEid(@Param("eid")Integer eid);
	/**
	 * 获取到所有传感器的编号
	 * @return
	 */
	public List<Integer> getSensorId();
	/**
	 * 根据传感器Id查询电子数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartData> getEchartDataBySensorId(@Param("sensorId")Integer sensorId);

	
}





