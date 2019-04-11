package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.NowData;

@Repository
public interface NowDataMapper {
	/*获得db_nowdata中所有数据信息，分页条件查询*/
	public List<NowData> getNowData(@Param("sensorId")Integer sensorId,
			@Param("gsCode")Integer gsCode,@Param("sensorDeviceId")Integer sensorDeviceId,
			@Param("sensorName")String sensorName,@Param("area") String area,@Param("index")Integer index,@Param("size")Integer size);
	/*	分页查询数据条数*/
	public int count(@Param("sensorId")Integer sensorId,
			@Param("gsCode")Integer gsCode,@Param("sensorDeviceId")Integer sensorDeviceId,
			@Param("sensorName")String sensorName,@Param("area") String area);
	
	
	/*根据主键sensorId查询数据*/

	public List<NowData> getNowDataById(@Param("sensorId")Integer sensorId);
	
	/*增加db_nowdata表数据记录*/
	public void add(NowData n);
	
	/*删除db_nowdata表数据记录数据*/
	public void de(@Param("sensorId")Integer sensorId);
	
	/*硬件部门修改db_nowdata表数据记录数据*/
	public void up(NowData n);

}
