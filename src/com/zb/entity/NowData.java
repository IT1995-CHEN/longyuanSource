package com.zb.entity;

public class NowData {
private Integer sensorId;
private Integer gsCode;
private String sensorDeviceId;
private String sensorName;
private String area;
private String sensorValue;
private String updateTime;


@Override
public String toString() {
	return "NowData [sensorId=" + sensorId + ", gsCode=" + gsCode
			+ ", sensorDeviceId=" + sensorDeviceId + ", sensorName="
			+ sensorName + ", area=" + area + ", sensorValue=" + sensorValue
			+ ", updateTime=" + updateTime + "]";
}
public Integer getSensorId() {
	return sensorId;
}
public void setSensorId(Integer sensorId) {
	this.sensorId = sensorId;
}
public Integer getGsCode() {
	return gsCode;
}
public void setGsCode(Integer gsCode) {
	this.gsCode = gsCode;
}
public String getSensorDeviceId() {
	return sensorDeviceId;
}
public void setSensorDeviceId(String sensorDeviceId) {
	this.sensorDeviceId = sensorDeviceId;
}
public String getSensorName() {
	return sensorName;
}
public void setSensorName(String sensorName) {
	this.sensorName = sensorName;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getSensorValue() {
	return sensorValue;
}
public void setSensorValue(String sensorValue) {
	this.sensorValue = sensorValue;
}
public String getUpdateTime() {
	return updateTime;
}
public void setUpdateTime(String updateTime) {
	this.updateTime = updateTime;
}


}
