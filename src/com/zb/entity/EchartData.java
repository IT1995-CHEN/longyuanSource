package com.zb.entity;

public class EchartData {
	private Integer eid;
	private Integer sensorId;
	private String numData;
	private String today;
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Integer getSensorId() {
		return sensorId;
	}
	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}
	public String getNumData() {
		return numData;
	}
	public void setNumData(String numData) {
		this.numData = numData;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	
	@Override
	public String toString() {
		return "Echartdata [eid=" + eid + ", sensorId=" + sensorId
				+ ", numData=" + numData + ", today=" + today + "]";
	}
		

}
