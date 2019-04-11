package com.zb.entity;

import sun.management.Sensor;

public class HisDataComb {
	private Integer hisId;
	private Integer sensorId;
	private Sensor sensor;
	private String preOperation;
	private String postOperation;
	private String operation;
	private String postOperationData;
	private String operatingTime;
	
	public Integer getHisId() {
		return hisId;
	}
	public void setHisId(Integer hisId) {
		this.hisId = hisId;
	}
	public Integer getSensorId() {
		return sensorId;
	}
	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}
	public Sensor getSensor() {
		return sensor;
	}
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	public String getPreOperation() {
		return preOperation;
	}
	public void setPreOperation(String preOperation) {
		this.preOperation = preOperation;
	}
	public String getPostOperation() {
		return postOperation;
	}
	public void setPostOperation(String postOperation) {
		this.postOperation = postOperation;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getPostOperationData() {
		return postOperationData;
	}
	public void setPostOperationData(String postOperationData) {
		this.postOperationData = postOperationData;
	}
	public String getOperatingTime() {
		return operatingTime;
	}
	public void setOperatingTime(String operatingTime) {
		this.operatingTime = operatingTime;
	}
	
	
	@Override
	public String toString() {
		return "HisDataComb [hisId=" + hisId + ", sensorId=" + sensorId
				+ ", sensor=" + sensor + ", preOperation=" + preOperation
				+ ", postOperation=" + postOperation + ", operation="
				+ operation + ", postOperationData=" + postOperationData
				+ ", operatingTime=" + operatingTime + "]";
	}

	

}
