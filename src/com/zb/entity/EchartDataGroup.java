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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numDataList == null) ? 0 : numDataList.hashCode());
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		result = prime * result
				+ ((sensorId == null) ? 0 : sensorId.hashCode());
		result = prime * result
				+ ((sensorName == null) ? 0 : sensorName.hashCode());
		result = prime * result
				+ ((todayList == null) ? 0 : todayList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EchartDataGroup other = (EchartDataGroup) obj;
		if (numDataList == null) {
			if (other.numDataList != null)
				return false;
		} else if (!numDataList.equals(other.numDataList))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (sensorId == null) {
			if (other.sensorId != null)
				return false;
		} else if (!sensorId.equals(other.sensorId))
			return false;
		if (sensorName == null) {
			if (other.sensorName != null)
				return false;
		} else if (!sensorName.equals(other.sensorName))
			return false;
		if (todayList == null) {
			if (other.todayList != null)
				return false;
		} else if (!todayList.equals(other.todayList))
			return false;
		return true;
	}
	
	

	
}
