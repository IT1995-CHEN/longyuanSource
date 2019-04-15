package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.HisData;
import com.zb.entity.HisDataComb;

@Repository
public interface HisDataMapper {
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
	public boolean de(@Param("hisId")Integer hisId);
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
	public HisDataComb  getHisDataCombById(@Param("hisId")Integer hisId);
	/**
	 * 根据传感器Id查询历史数据
	 * @param sensorId
	 * @return
	 */
	public List<HisDataComb> getHisDataBySensorId(@Param("sensorId")Integer sensorId);
	/**
	 * 根据传感器Id、传感器名称、传感器设备Id分页查询历史数据
	 * @param sensorId
	 * @param sensorName
	 * @param sensorDeviceId
	 * @param index
	 * @param size
	 * @return	List<HisDataComb>
	 */
	public List<HisDataComb> getAllPage(@Param("sensorId")Integer sensorId,@Param("sensorName")String sensorName,@Param("sensorDeviceId")Integer sensorDeviceId,@Param("index")Integer index,@Param("size")Integer size);
	/**
	 * 根据传感器Id、传感器名称、传感器设备Id分页查询历史数据行数
	 * @param sensorId
	 * @param sensorName
	 * @param sensorDeviceId
	 * @return	List<HisDataComb>
	 */
	public int getAllPageCount(@Param("sensorId")Integer sensorId,@Param("sensorName")String sensorName,@Param("sensorDeviceId")Integer sensorDeviceId);
	/**
	 * 定时任务更新电子数据
	 * @return
	 */
	public int jobAddEchartData();
}





