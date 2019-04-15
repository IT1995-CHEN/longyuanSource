package com.zb.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.zb.mapper.HisDataMapper;

@Service("TaskJob")
public class TaskJob {
	@Autowired
	private HisDataMapper hisDataMapper;
	
	@Scheduled(cron="0 */2 * * * ?")
	public void job() { 
	   int i =hisDataMapper.jobAddEchartData();
	   System.out.println("#############################################"+i+"#######################################");
	}

}
