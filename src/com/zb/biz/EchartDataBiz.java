package com.zb.biz;

import java.util.List;

import com.zb.entity.EchartData;
import com.zb.entity.EchartDataComb;
import com.zb.entity.EchartDataGroup;

public interface EchartDataBiz {
	/**
	 * 根据电子数据的id查询电子数据
	 * @param eid
	 * @return
	 */
	public EchartData getEchartDataByEid(Integer eid);
	/**
	 * 根据传感器Id、开始时间、结束 时间查询电子数据
	 * @param sensorId
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public List<EchartData> getEchartDataBySensorId(Integer sensorId,String beginTime,String endTime);
	/**
	 * 根据传感器id、电子数据开始日期、电子数据结束时间、传感器名称、gsCode查询所有的电子数据
	 * @param sensorId
	 * @param beginTime
	 * @param endTime
	 * @param sensorName
	 * @param gsCode
	 * @return
	 */
	public List<EchartDataGroup> getEchartDataGroupBySGT(Integer sensorId,String beginTime,String endTime,String sensorName,String gsCode);

	/**
	 * 获取根据传感器id分组后的数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartDataGroup> getEchartDataGroup();
	
}





