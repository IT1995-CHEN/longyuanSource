package com.zb.biz.impl;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zb.biz.NowDataBiz;
import com.zb.entity.HisData;
import com.zb.entity.NowData;
import com.zb.mapper.HisDataMapper;
import com.zb.mapper.NowDataMapper;
import com.zb.util.PageUtil;

@Service("db_nowdata")
public class NowDataBizImpl  implements NowDataBiz {

	@Autowired
	private NowDataMapper nowDataMapper;
	@Autowired
	private HisDataMapper hisDataMapper;
	@Override
	public PageUtil<NowData> getNowData(Integer sensorId, String gsCode,
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
	public NowData getNowDataById(Integer sensorId) {
		// TODO Auto-generated method stub
		return nowDataMapper.getNowDataById(sensorId);
	}

	@Override
	public void add(NowData n) {
		// TODO Auto-generated method stub
		try {
			nowDataMapper.add(n);
			all(n, "insert");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void de(Integer sensorId) {
		// TODO Auto-generated method stub
		try {
			all(getNowDataById(sensorId), "delete");
			nowDataMapper.de(sensorId);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	@Override
	public void up(NowData n) {
		// TODO Auto-generated method stub
		try {
			nowDataMapper.up(n);
			all(n, "update");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void all(NowData n, String type) throws UnsupportedEncodingException {
		HisData his = new HisData();
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = n.toString();
		System.out.println(str);
		his.setOperatingTime(df.format(date));
			System.out.println(type);
		his.setOperation(type);
		System.out.println(his.getOperation());
		his.setSensorId(n.getSensorId());
		his.setPostOperationData(n.getSensorValue());
		if (his.getOperation().equals("insert")) {
			his.setPreOperation("");
			his.setPostOperation(str);
		} else if (his.getOperation().equals("delete")) {
			his.setPreOperation(str);
			his.setPostOperation("");
		} else {
			NowData data = getNowDataById(n.getSensorId());
			his.setPreOperation(data.toString());
			his.setPostOperation(str);
		}
		hisDataMapper.add(his);

	}
	
	/*获取db_nowdata表所有的数据记录数据*/
	public List<NowData> getAllNowData(){
		List<NowData> nowDatas = nowDataMapper.getAllNowData();
		return nowDatas;
	}

}
