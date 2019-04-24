package com.zb.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.zb.entity.Commodity;
import com.zb.entity.Operation;
import com.zb.mapper.CommodityMapper;
import com.zb.mapper.HisDataMapper;
import com.zb.mapper.NowDataMapper;
import com.zb.mapper.OperationMapper;

@Service("TaskJob")
public class TaskJob {
	@Autowired
	private HisDataMapper hisDataMapper;
	
	@Autowired
	private CommodityMapper commodityMapper;
	
	@Autowired
	private OperationMapper operationMapper;
	
	/**
	 * 定时生成、更新echartdata
	 */
	//@Scheduled(cron="0 */20 * * * ?")
	public void jobAddEchartData() { 
	   int i =hisDataMapper.jobAddEchartData();
	   System.out.println("#############################################"+i+"#######################################");
	}
	
	//@Scheduled(cron="0 */10 * * * ?")
	public void jobAddOperation(){
		List<Commodity> commodities = commodityMapper.getAll();
		List<String> zhuList = new ArrayList<String>();
		zhuList.add("喂食");
		zhuList.add("清洁");
		List<String> yuList = new ArrayList<String>();
		yuList.addAll(zhuList);
		yuList.add(1,"供氧");
		List<String> baicaiList = new ArrayList<String>();
		baicaiList.add("浇水");
		baicaiList.add("施肥");
		baicaiList.add("人工光照");
		baicaiList.add("控温");
		
		Operation operation = new Operation();
		if(commodities.size()>0){
			for (int i=0;i<commodities.size();i++) {
				if(commodities.get(i).getProductName().matches(".*猪.*")){
					for (int j=0;j<zhuList.size();j++) {
						operation.setGsCode(commodities.get(i).getGsCode());
						operation.setOperationName(zhuList.get(j));
						boolean f = operationMapper.add(operation);
						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+operation+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					}
				}
				if(commodities.get(i).getProductName().matches(".*鱼.*")){
					for (int j=0;j<yuList.size();j++) {
						operation.setGsCode(commodities.get(i).getGsCode());
						operation.setOperationName(yuList.get(j));
						boolean f = operationMapper.add(operation);
						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+operation+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					}
				}
				if(commodities.get(i).getProductName().matches(".*菜.*")){
					for (int j=0;j<baicaiList.size();j++) {
						operation.setGsCode(commodities.get(i).getGsCode());
						operation.setOperationName(baicaiList.get(j));
						boolean f = operationMapper.add(operation);
						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+operation+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					}
				}
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	

}
