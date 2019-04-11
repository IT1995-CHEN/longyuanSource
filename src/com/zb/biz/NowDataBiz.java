package com.zb.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zb.entity.NowData;
import com.zb.util.PageUtil;

public interface NowDataBiz {
	/*获得db_nowdata中所有数据信息，分页条件查询*/
	public PageUtil<NowData> getNowData(Integer sensorId,Integer gsCode,Integer sensorDeviceId,
		String sensorName,String area,PageUtil<NowData> page);
	
	/*根据主键sensorId查询数据*/

	public List<NowData> getNowDataById(Integer sensorId);
	
	/*增加db_nowdata表数据记录*/
	public void add(NowData n);
	
	/*删除db_nowdata表数据记录数据*/
	public void de(Integer sensorId);
	
	/*硬件部门修改db_nowdata表数据记录数据*/
	public void up(NowData n);
}
