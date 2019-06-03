package com.zb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zb.entity.Operation;
import com.zb.entity.OperationComb;

@Repository
public interface OperationMapper {
	/**
	 * 添加操作数据
	 * @param operation
	 * @return
	 */
	public boolean add(Operation operation);
	/**
	 * 根据操作编号查询操作数据
	 * @param oid
	 * @return
	 */
	public OperationComb getOperationCombById(@Param("oid")Integer oid);
	/**
	 * 获取所有的操作数据
	 * @param gsCode
	 * @param operationName
	 * @param operationTime
	 * @return
	 */
	public List<OperationComb> getAllOperationComb(@Param("gsCode")String gsCode,@Param("operationName")String operationName,@Param("operationTime")String operationTime,@Param("fedding")String fedding,@Param("weight")String weight,@Param("drinkWater")String drinkWater,@Param("bodyTemperature")String bodyTemperature,@Param("temperature")String temperature,@Param("light")String light,@Param("dust")String dust,@Param("vulcanizationConcentrationSensor")String vulcanizationConcentrationSensor,@Param("nitrogenConcentration")String nitrogenConcentration,@Param("feeder")String feeder,@Param("fan")String fan,@Param("videoSwitch")String videoSwitch,@Param("wetCurtainFilm")String wetCurtainFilm,@Param("farmOperation")String farmOperation,@Param("operator")String operator);
	/**
	 * 根据gsCode编码、操作名字 、操作时间查询的记录行数
	 * @param gsCode
	 * @param operationName
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public int getAllPageCount(@Param("gsCode")String gsCode,@Param("operationName")String operationName,@Param("beginTime")String beginTime,@Param("endTime")String endTime);
	/**
	 * 根据gsCode编码、操作名字 、操作开始时间、操作结束时间分页查询的操作数据
	 * @param gsCode
	 * @param operationName
	 * @param beginTime
	 * @param endTime
	 * @param index
	 * @param size
	 * @return
	 */
	public List<OperationComb> getAllPage(@Param("gsCode")String gsCode,@Param("operationName")String operationName,@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("index")Integer index,@Param("size")Integer size);

}
