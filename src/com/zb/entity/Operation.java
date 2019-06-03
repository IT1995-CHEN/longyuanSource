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
	private String fedding;
	private String weight;
	private String drinkWater;
	private String bodyTemperature;
	private String temperature;
	private String light;
	private String dust;
	private String vulcanizationConcentrationSensor;
	private String nitrogenConcentration;
	private String feeder;
	private String fan;
	private String videoSwitch;
	private String wetCurtainFilm;
	private String farmOperation;
	private String operator;
	
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
	public String getFedding() {
		return fedding;
	}
	public void setFedding(String fedding) {
		this.fedding = fedding;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDrinkWater() {
		return drinkWater;
	}
	public void setDrinkWater(String drinkWater) {
		this.drinkWater = drinkWater;
	}
	public String getBodyTemperature() {
		return bodyTemperature;
	}
	public void setBodyTemperature(String bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}
	public String getDust() {
		return dust;
	}
	public void setDust(String dust) {
		this.dust = dust;
	}
	public String getVulcanizationConcentrationSensor() {
		return vulcanizationConcentrationSensor;
	}
	public void setVulcanizationConcentrationSensor(String vulcanizationConcentrationSensor) {
		this.vulcanizationConcentrationSensor = vulcanizationConcentrationSensor;
	}
	public String getNitrogenConcentration() {
		return nitrogenConcentration;
	}
	public void setNitrogenConcentration(String nitrogenConcentration) {
		this.nitrogenConcentration = nitrogenConcentration;
	}
	public String getFeeder() {
		return feeder;
	}
	public void setFeeder(String feeder) {
		this.feeder = feeder;
	}
	public String getFan() {
		return fan;
	}
	public void setFan(String fan) {
		this.fan = fan;
	}
	public String getVideoSwitch() {
		return videoSwitch;
	}
	public void setVideoSwitch(String videoSwitch) {
		this.videoSwitch = videoSwitch;
	}
	public String getWetCurtainFilm() {
		return wetCurtainFilm;
	}
	public void setWetCurtainFilm(String wetCurtainFilm) {
		this.wetCurtainFilm = wetCurtainFilm;
	}
	public String getFarmOperation() {
		return farmOperation;
	}
	public void setFarmOperation(String farmOperation) {
		this.farmOperation = farmOperation;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	@Override
	public String toString() {
		return "Operation [oid=" + oid + ", gsCode=" + gsCode + ", operationName=" + operationName + ", operationInfo="
				+ operationInfo + ", operationTime=" + operationTime + ", person=" + person + ", fedding=" + fedding
				+ ", weight=" + weight + ", drinkWater=" + drinkWater + ", bodyTemperature=" + bodyTemperature
				+ ", temperature=" + temperature + ", light=" + light + ", dust=" + dust
				+ ", vulcanizationConcentrationSensor=" + vulcanizationConcentrationSensor + ", nitrogenConcentration="
				+ nitrogenConcentration + ", feeder=" + feeder + ", fan=" + fan + ", videoSwitch=" + videoSwitch
				+ ", wetCurtainFilm=" + wetCurtainFilm + ", farmOperation=" + farmOperation + ", operator=" + operator
				+ "]";
	}



}
