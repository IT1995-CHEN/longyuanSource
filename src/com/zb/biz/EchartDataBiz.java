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
	 * 根据电子数据的传感器id查询电子数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartData> getEchartDataBySensorId(Integer sensorId);
	/**
	 * 根据传感器id、电子数据日期、gsCode查询所有的电子数据
	 * @param sensorId
	 * @param today
	 * @param gsCode
	 * @return
	 */
	public List<EchartDataComb> getEchartDataCombBySGT(Integer sensorId,String today,String gsCode);

	/**
	 * 获取根据传感器id分组后的数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartDataGroup> getEchartDataGroup();
	
}





