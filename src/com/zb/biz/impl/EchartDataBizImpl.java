package com.zb.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zb.biz.EchartDataBiz;
import com.zb.entity.Commodity;
import com.zb.entity.EchartData;
import com.zb.entity.EchartDataComb;
import com.zb.entity.EchartDataGroup;
import com.zb.mapper.CommodityMapper;
import com.zb.mapper.EchartDataMapper;
import com.zb.mapper.NowDataMapper;

@Service("db_echartdata")
public class EchartDataBizImpl implements EchartDataBiz{
	
	@Autowired
	private EchartDataMapper echartDataMapper;
	@Autowired
	private NowDataMapper  nowDataMapper;
	@Autowired
	private CommodityMapper commodityMapper;
	
	/**
	 * 根据电子数据的id查询电子数据
	 * @param eid
	 * @return
	 */
	public EchartData getEchartDataByEid(Integer eid){
		EchartData echartData = echartDataMapper.getEchartDataByEid(eid);
		return echartData;
	}

	/**
	 * 根据电子数据的传感器id查询电子数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartData> getEchartDataBySensorId(Integer sensorId,String beginTime,String endTime){
		List<EchartData> echartDatas = echartDataMapper.getEchartDataBySensorId(sensorId, beginTime, endTime);
		return echartDatas;
	}
	/**
	 * 根据传感器id、电子数据开始日期、电子数据结束时间、传感器名称、gsCode查询所有的电子数据
	 * @param sensorId
	 * @param beginTime
	 * @param endTime
	 * @param sensorName
	 * @param gsCode
	 * @return
	 */
	public List<EchartDataGroup> getEchartDataGroupBySGT(Integer sensorId,String beginTime,String endTime,String sensorName,String gsCode){
		List<EchartDataComb> echartDataCombs = echartDataMapper.getEchartDataCombBySGT(sensorId, beginTime, endTime, sensorName, gsCode);
		List<EchartDataGroup> echartDataGroupList = new ArrayList<EchartDataGroup>();

		System.out.println();
		for (EchartDataComb e : echartDataCombs) {
			System.out.println(e);
		}
		System.out.println();
		
		if(echartDataCombs.size()>0){
			for (int i=0;i<echartDataCombs.size();i++) {
				EchartDataGroup echartDataGroup = new EchartDataGroup();
				echartDataGroup.setSensorId(echartDataCombs.get(i).getSensorId());
				echartDataGroup.setSensorName(echartDataCombs.get(i).getSensorName());
				echartDataGroup.setProductName(echartDataCombs.get(i).getProductName());
				List<EchartData> echartDatas=echartDataMapper.getEchartDataBySensorId(echartDataCombs.get(i).getSensorId(),null,null);
				List<Double> numDataList = new ArrayList<Double>();
				List<String> todayList = new ArrayList<String>();
				for (int j=0;j<echartDatas.size();j++) {
					numDataList.add(Double.valueOf(echartDatas.get(j).getNumData()));
					todayList.add(echartDatas.get(j).getToday());
				}
				
				echartDataGroup.setNumDataList(numDataList);
				echartDataGroup.setTodayList(todayList);
				echartDataGroupList.add(echartDataGroup);
			
			}		

			List<EchartDataGroup> echartDataGroups = new ArrayList<EchartDataGroup>();
			for (int i=0;i<echartDataGroupList.size();i++) {
				if(!echartDataGroups.contains(echartDataGroupList.get(i))){
					echartDataGroups.add(echartDataGroupList.get(i));
				}
			}		
			return echartDataGroups;		
		}
				
		return null;
	}
	/**
	 * 获取根据传感器id分组后的数据
	 * @param sensorId
	 * @return
	 */
	public List<EchartDataGroup> getEchartDataGroup(){
		List<Integer> sensorIdList = echartDataMapper.getSensorId();
		List<EchartDataGroup> echartDataGroupList = new ArrayList<EchartDataGroup>();
		if(sensorIdList!=null){
			for (int i=0;i<sensorIdList.size();i++) {
				EchartDataGroup echartDataGroup = new EchartDataGroup();
				echartDataGroup.setSensorId(sensorIdList.get(i));
				System.out.println(sensorIdList.get(i));
				String sensorName=nowDataMapper.getNowDataById(sensorIdList.get(i)).getSensorName();
				echartDataGroup.setSensorName(sensorName);
				System.out.println(sensorName);
				List<Commodity> commodities = commodityMapper.getInfoByGs(nowDataMapper.getNowDataById(sensorIdList.get(i)).getGsCode());
				Commodity commodity = new Commodity();
				if (commodities.size()>0) {
					for (int j = 0; j<commodities.size();j++) {
						 commodity=commodities.get(0);
					}
				}
				echartDataGroup.setProductName(commodity.getProductName());
				System.out.println(commodity.getProductName());
				List<EchartData> echartDatas=echartDataMapper.getEchartDataBySensorId(sensorIdList.get(i),null,null);
				List<Double> numDataList = new ArrayList<Double>();
				List<String> todayList = new ArrayList<String>();
				for (int j=0;j<echartDatas.size();j++) {
					numDataList.add(Double.valueOf(echartDatas.get(j).getNumData()));
					todayList.add(echartDatas.get(j).getToday());
				}
				
				echartDataGroup.setNumDataList(numDataList);
				echartDataGroup.setTodayList(todayList);
				echartDataGroupList.add(echartDataGroup);	
			}
			
			return echartDataGroupList;
			}

		return null;

	}
	
}





