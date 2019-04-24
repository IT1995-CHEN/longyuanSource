package com.zb.entity;
/**
 * 操作表
 * @author Administrator
 *
 */
public class Operation {
	private Integer oid;
	private String gsCode;
	private String operationName;
	private String operationInfo;
	private String operationTime;
	private String person;
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getGsCode() {
		return gsCode;
	}
	public void setGsCode(String gsCode) {
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
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		return "Operation [oid=" + oid + ", gsCode=" + gsCode
				+ ", operationName=" + operationName + ", operationInfo="
				+ operationInfo + ", operationTime=" + operationTime
				+ ", person=" + person + "]";
	}
	
	
	
	

}
