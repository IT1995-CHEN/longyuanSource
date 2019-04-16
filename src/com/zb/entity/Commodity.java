package com.zb.entity;

public class Commodity {

	private Integer gsCode;
	private String  gsImg;
	private String  productImg;
	private String  productName;
	private String  productDescription;
	private String  location;
	private String  addressLongitude;
	private String  addressLatitude;
	private String  enterprise;
	private String  storageTem;
	private String  packageWay;
	private String  GrowthEnvir;
	private String  growthTime;
	private String  quality;
	private String  productKind;
	private String  productionDate;
	private String  nutrientContent;
	private String  createTime;
	private String  modifyTime;
	
	@Override
	public String toString() {
		return "Commodity [gsCode=" + gsCode + ", gsImg=" + gsImg
				+ ", productImg=" + productImg + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", location="
				+ location + ", addressLongitude=" + addressLongitude
				+ ", addressLatitude=" + addressLatitude + ", enterprise="
				+ enterprise + ", storageTem=" + storageTem + ", packageWay="
				+ packageWay + ", GrowthEnvir=" + GrowthEnvir + ", growthTime="
				+ growthTime + ", quality=" + quality + ", productKind="
				+ productKind + ", productionDate=" + productionDate
				+ ", nutrientContent=" + nutrientContent + ", createTime="
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddressLongitude() {
		return addressLongitude;
	}
	public void setAddressLongitude(String addressLongitude) {
		this.addressLongitude = addressLongitude;
	}
	public String getAddressLatitude() {
		return addressLatitude;
	}
	public void setAddressLatitude(String addressLatitude) {
		this.addressLatitude = addressLatitude;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public String getStorageTem() {
		return storageTem;
	}
	public void setStorageTem(String storageTem) {
		this.storageTem = storageTem;
	}
	public String getPackageWay() {
		return packageWay;
	}
	public void setPackageWay(String packageWay) {
		this.packageWay = packageWay;
	}
	public String getGrowthEnvir() {
		return GrowthEnvir;
	}
	public void setGrowthEnvir(String growthEnvir) {
		GrowthEnvir = growthEnvir;
	}
	public String getGrowthTime() {
		return growthTime;
	}
	public void setGrowthTime(String growthTime) {
		this.growthTime = growthTime;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getProductKind() {
		return productKind;
	}
	public void setProductKind(String productKind) {
		this.productKind = productKind;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public String getNutrientContent() {
		return nutrientContent;
	}
	public void setNutrientContent(String nutrientContent) {
		this.nutrientContent = nutrientContent;
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
