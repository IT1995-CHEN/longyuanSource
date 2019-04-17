package com.zb.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.zb.entity.NowData;
import com.zb.mapper.HisDataMapper;
import com.zb.mapper.NowDataMapper;

@Service("TaskJob")
public class TaskJob {
	@Autowired
	private NowDataMapper nowDataMapper;
	
	@Autowired
	private HisDataMapper hisDataMapper;
	
	//@Scheduled(cron="0 */10 * * * ?")
	public void jobAdd() { 
	   int i =hisDataMapper.jobAddEchartData();
	   System.out.println("#############################################"+i+"#######################################");
	}
	
	
	//@Scheduled(cron="0 */2 * * * ?")
	public void jobUpdate() {

		List<NowData> nowDatas = nowDataMapper.getAllNowData();
		if (nowDatas!=null) {
			for (int i=0;i<nowDatas.size();i++) {
				NowData nowData = new NowData();
				nowData.setSensorId(nowDatas.get(i).getSensorId());
				int num=(int)(1+Math.random()*(100-1+1));
				nowData.setSensorValue(String.valueOf(num));
				nowDataMapper.up(nowData);
				 System.out.println("-------------------------------------------------"+nowData+"-----------------------------------------");
	
			}
		}
		
	  
	}

}
