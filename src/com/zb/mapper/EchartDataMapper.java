package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.EchartData;
import com.zb.entity.EchartDataComb;

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
	 * 根据传感器id、电子数据日期、gsCode查询所有的电子数据
	 * @param sensorId
	 * @param today
	 * @param gsCode
	 * @return
	 */
	public List<EchartDataComb> getEchartDataCombBySGT(@Param("sensorId")Integer sensorId,@Param("today")String today,@Param("gsCode")String gsCode);
	
	/**
	 * 根据传感器Id查询电子数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartData> getEchartDataBySensorId(@Param("sensorId")Integer sensorId);

	
}





