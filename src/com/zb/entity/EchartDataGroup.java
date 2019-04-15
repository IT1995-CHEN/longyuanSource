package com.zb.entity;

import java.util.List;

public class EchartDataGroup {
	private Integer sensorId;
	private List<Double> numDataList;
	private List<String> todayList;
	
	public Integer getSensorId() {
		return sensorId;
	}
	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}
	public List<Double> getNumDataList() {
		return numDataList;
	}
	public void setNumDataList(List<Double> numDataList) {
		this.numDataList = numDataList;
	}
	public List<String> getTodayList() {
		return todayList;
	}
	public void setTodayList(List<String> todayList) {
		this.todayList = todayList;
	}
	
	@Override
	public String toString() {
		return "EchartDataGroup [sensorId=" + sensorId + ", numDataList="
				+ numDataList + ", todayList=" + todayList + "]";
	}

	
}
