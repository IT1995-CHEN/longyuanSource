package com.zb.entity;

public class EchartDataComb {
	private Integer eid;
	private Integer sensorId;
	private NowDataComb nowDataComb;
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
	public NowDataComb getNowDataComb() {
		return nowDataComb;
	}
	public void setNowDataComb(NowDataComb nowDataComb) {
		this.nowDataComb = nowDataComb;
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
		return "EchartDataComb [eid=" + eid + ", sensorId=" + sensorId
				+ ", nowDataComb=" + nowDataComb + ", numData=" + numData
				+ ", today=" + today + "]";
	}
		
}
