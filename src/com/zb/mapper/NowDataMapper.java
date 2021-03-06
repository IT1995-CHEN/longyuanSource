package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.NowData;

@Repository
public interface NowDataMapper {
	/**
	 * 获得db_nowdata中所有数据信息，分页条件查询
	 * @param sensorId;gsCode;sensorDeviceId;sensorName;area;index;size
	 * @return list
	 * */
	public List<NowData> getNowData(@Param("sensorId")Integer sensorId,
			@Param("gsCode")String gsCode,@Param("sensorDeviceId")Integer sensorDeviceId,
			@Param("sensorName")String sensorName,@Param("area") String area,@Param("index")Integer index,@Param("size")Integer size);
	/**
	 * 	分页查询数据条数
	 * @param sensorId;gsCode;sensorDeviceId;sensorName;area;
	 * @return int
	 */
	public int count(@Param("sensorId")Integer sensorId,
			@Param("gsCode")String gsCode,@Param("sensorDeviceId")Integer sensorDeviceId,
			@Param("sensorName")String sensorName,@Param("area") String area);
	
	
	/**
	 * 根据主键sensorId查询数据
	 * @param sensorId
	 * @return NowData
	 * */

	public NowData getNowDataById (@Param("sensorId")Integer sensorId);
	
	/**
	 * 增加db_nowdata表数据记录
	 * @param NowData
	 * 
	 * */
	public void add(NowData n);
	
	/**
	 * 删除db_nowdata表数据记录数据
	 * @param sensorId
	 * 
	 * */
	public void de(@Param("sensorId") Integer sensorId);
	
	/**
	 * 硬件部门修改db_nowdata表数据记录数据
	 * @param NowData
	 * 
	 * */
	public void up(NowData n);
	
	/**
	 * 获取db_nowdata表所有的数据记录数据
	 * @param
	 * @return List<NowData>
	 * */
	public List<NowData> getAllNowData();
}
