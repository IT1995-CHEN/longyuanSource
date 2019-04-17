package com.zb.entity;

import java.util.List;

public class EchartDataGroup {
	private Integer sensorId;
	private String  sensorName;
	private String productName;
	private List<Double> numDataList;
	private List<String> todayList;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
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
		return "EchartDataGroup [sensorId=" + sensorId + ", sensorName="
				+ sensorName + ", productName=" + productName
				+ ", numDataList=" + numDataList + ", todayList=" + todayList
				+ "]";
	}
	
	

	
}
