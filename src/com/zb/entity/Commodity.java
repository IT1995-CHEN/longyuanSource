package com.zb.entity;

public class Commodity {

	private Integer gsCode;
	private String  gsImg;
	private String  productImg;
	private String  productName;
	private String  productDescription;
	private String  productionDate;
	private String  createTime;
	private String  modifyTime;
	
	@Override
	public String toString() {
		return "Commodity [gsCode=" + gsCode + ", gsImg=" + gsImg
				+ ", productImg=" + productImg + ", productName=" + productName
				+ ", productDescription=" + productDescription
				+ ", productionDate=" + productionDate + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + "]";
	}
	public Integer getGsCode() {
		return gsCode;
	}
	public void setGsCode(Integer gsCode) {
		this.gsCode = gsCode;
	}
	public String getGsImg() {
		return gsImg;
	}
	public void setGsImg(String gsImg) {
		this.gsImg = gsImg;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
}
