package com.zb.biz;

import java.util.List;

import com.zb.entity.EchartData;
import com.zb.entity.EchartDataGroup;

public interface EchartDataBiz {
	/**
	 * 根据电子数据的id查询电子数据
	 * @param eid
	 * @return
	 */
	public EchartData getEchartDataByEid(Integer eid);

	/**
	 * 获取根据传感器id分组后的数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartDataGroup> getEchartDataGroup();
	
}





