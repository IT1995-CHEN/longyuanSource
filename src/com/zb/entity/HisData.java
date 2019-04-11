package com.zb.entity;

public class HisData {
	private Integer hisId;//历史ID
	private Integer sensorId;//传感器ID
	private String preOperation;//操作前项
	private String postOperation;//操作后项
	private String operation;//操作行为
	private String postOperationData;//操作后数据
	private String operatingTime;//操作时间
	
	
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
		return "HisData [hisId=" + hisId + ", sensorId=" + sensorId
				+ ", preOperation=" + preOperation + ", postOperation="
				+ postOperation + ", operation=" + operation
				+ ", postOperationData=" + postOperationData
				+ ", operatingTime=" + operatingTime + "]";
	}

}
