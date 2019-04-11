package com.zb.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zb.biz.NowDataBiz;
import com.zb.entity.NowData;
import com.zb.mapper.NowDataMapper;
import com.zb.util.PageUtil;

@Service("db_nowdata")
public class NowDataBizImpl  implements NowDataBiz {

	@Autowired
	private NowDataMapper nowDataMapper;
	@Override
	public PageUtil<NowData> getNowData(Integer sensorId, Integer gsCode,
			Integer sensorDeviceId, String sensorName, String area,
			PageUtil<NowData> page) {
		// TODO Auto-generated method stub
		List<NowData> nList = nowDataMapper.getNowData(sensorId, gsCode, sensorDeviceId, sensorName, area, (page.getIndex() - 1) * page.getSize(), page.getSize());
		page.setPage(nList);
		int count = nowDataMapper.count(sensorId, gsCode, sensorDeviceId, sensorName, area);
		page.setCount(count);
		return page;
	}

	@Override
	public List<NowData> getNowDataById(Integer sensorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(NowData n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void de(Integer sensorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up(NowData n) {
		// TODO Auto-generated method stub
		
	}

}
