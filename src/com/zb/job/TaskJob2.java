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
	
	/**
	 * 定时修改nowdata数据
	 */                                                                                                                                                                                                                                                                                                                                                                        
	//@Scheduled(cron="0 */15 * * * ?")
	public void jobUpdateNowData() {
		List<NowData> nowDatas = nowDataBiz.getAllNowData();
		double num = 0;
		if (nowDatas!=null) {
			for (int i=0;i<nowDatas.size();i++) {
				NowData nowData = new NowData();
				nowData.setSensorId(nowDatas.get(i).getSensorId());
				switch(nowDatas.get(i).getSensorName()){
				 case "空气温度传感器(℃)":
					 num=(int)(Math.random()*(80-(-40)+1)+(-40));
					 break;
				 case "空气含氧传感器(%VOL)":
					 num=(int)(Math.random()*(30-(0)+1)+(0));
					 break;
				 case "光照传感器(Lux)":
					 num=(int)(Math.random()*(65535-(0)+1)+(0));
					 break;
				 case "空气湿度传感器(%RH)":
					 num=(int)(Math.random()*(99-(0)+1)+(0));
					 break;
				 case "空气含氨传感器(ppm)":
					 num=(int)(Math.random()*(200-(0)+1)+(0));
					 break;
				 case "水溶氧传感器(Do)":
					 num=(int)(Math.random()*(199-(0)+1)+(0));
					 break;
				 case "水温传感器(℃)":
					 num=(int)(Math.random()*(400-(-200)+1)+(-200));
					 break;
				 case "流速传感器(m/s)":
					 num=(int)(Math.random()*(320-(2)+1)+(2));
					 num = num/10;
					 break;
				 case "水管压力传感器(bar)":
					 num=(int)(Math.random()*(600-(-1)+1)+(-1));
					 break;
				 case "土壤湿度传感器(%RH)":
					 num=(int)(Math.random()*(100-(0)+1)+(0));
					 break;
				 case "PH值传感器(PH)":
					 num=(int)(Math.random()*(14-(0)+1)+(0));
					 break;
				 case "土壤含氮传感器(%VOL)":
					 num=(int)(Math.random()*(33-(0)+1)+(0));
					 break;
				 case "土壤含氨传感器(ppm)":
					 num=(int)(Math.random()*(200-(0)+1)+(0));
					 break;
				
				}	
				
				nowData.setSensorValue(String.valueOf(num));
				nowDataBiz.up(nowData);
				 System.out.println("-------------------------------------------------"+nowData+"-----------------------------------------");
	
			}
		}
		
	  
	}

}
