package com.zb.entity;

public class EchartDataComb {
	private Integer eid;
	private Integer sensorId;
	private String numData;
	private String today;
	private String sensorName;
	private String gsCode;
	private String productName;
	
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
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	public String getGsCode() {
		return gsCode;
	}
	public void setGsCode(String gsCode) {
		this.gsCode = gsCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "EchartDataComb [eid=" + eid + ", sensorId=" + sensorId
				+ ", numData=" + numData + ", today=" + today + ", sensorName="
				+ sensorName + ", gsCode=" + gsCode + ", productName="
				+ productName + "]";
	}
	
	

}
