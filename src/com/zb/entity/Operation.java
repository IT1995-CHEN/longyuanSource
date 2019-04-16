package com.zb.entity;
/**
 * 操作表
 * @author Administrator
 *
 */
public class Operation {
	private Integer oid;
	private Integer gsCode;
	private String operationName;
	private String operationInfo;
	private String operationTime;
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getGsCode() {
		return gsCode;
	}
	public void setGsCode(Integer gsCode) {
		this.gsCode = gsCode;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getOperationInfo() {
		return operationInfo;
	}
	public void setOperationInfo(String operationInfo) {
		this.operationInfo = operationInfo;
	}
	public String getOperationTime() {
		return operationTime;
	}
	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}
	
	@Override
	public String toString() {
		return "Operation [oid=" + oid + ", gsCode=" + gsCode
				+ ", operationName=" + operationName + ", operationInfo="
				+ operationInfo + ", operationTime=" + operationTime + "]";
	}
	
	

}