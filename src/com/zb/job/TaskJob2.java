package com.zb.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.zb.biz.NowDataBiz;
import com.zb.entity.NowData;

@Controller("TaskJob2")
public class TaskJob2 {
	@Autowired
	private NowDataBiz nowDataBiz;
	
	@Scheduled(cron="0 */2 * * * ?")
	public void jobUpdate() {

		List<NowData> nowDatas = nowDataBiz.getAllNowData();
		if (nowDatas!=null) {
			for (int i=0;i<nowDatas.size();i++) {
				NowData nowData = new NowData();
				nowData.setSensorId(nowDatas.get(i).getSensorId());
				int num=(int)(1+Math.random()*(100-1+1));
				nowData.setSensorValue(String.valueOf(num));
				nowDataBiz.up(nowData);
				 System.out.println("-------------------------------------------------"+nowData+"-----------------------------------------");
	
			}
		}
		
	  
	}

}
