package com.javaex.vo;

import org.springframework.web.multipart.MultipartFile;

public class ProductVo {

	private int productNo;
	private int scNo;
	private String productName;
	private int price ;
	private String storage;
	private String detail;
	private String saveName;
	private int best;
	private int mcNo;
	private String mcName;
	private String scName;

	private MultipartFile file;

	public ProductVo() {
		super();
	}

	public ProductVo(int mcNo, String mcName, int scNo, String scName) {
		super();
		this.mcNo = mcNo;
		this.mcName = mcName;
		this.scName = scName;
		this.scNo = scNo;
	}

	public ProductVo(int productNo, int scNo, String productName, int price, String storage, String detail,
			String saveName, int best) {
		super();
		this.productNo = productNo;
		this.scNo = scNo;
		this.productName = productName;
		this.price = price;
		this.storage = storage;
		this.detail = detail;
		this.saveName = saveName;
		this.best = best;
	}

	public ProductVo(int productNo, int scNo, String productName, int price, String storage, String detail,
			String saveName, int best, int mcNo, String mcName, String scName, MultipartFile file) {
		super();
		this.productNo = productNo;
		this.scNo = scNo;
		this.productName = productName;
		this.price = price;
		this.storage = storage;
		this.detail = detail;
		this.saveName = saveName;
		this.best = best;
		this.mcNo = mcNo;
		this.mcName = mcName;
		this.scName = scName;
		this.file = file;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getScNo() {
		return scNo;
	}

	public void setScNo(int scNo) {
		this.scNo = scNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public int getBest() {
		return best;
	}

	public void setBest(int best) {
		this.best = best;
	}

	public int getMcNo() {
		return mcNo;
	}

	public void setMcNo(int mcNo) {
		this.mcNo = mcNo;
	}

	public String getMcName() {
		return mcName;
	}

	public void setMcName(String mcName) {
		this.mcName = mcName;
	}

	public String getScName() {
		return scName;
	}

	public void setScName(String scName) {
		this.scName = scName;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "ProductVo [productNo=" + productNo + ", scNo=" + scNo + ", productName=" + productName + ", price="
				+ price + ", storage=" + storage + ", detail=" + detail + ", saveName=" + saveName + ", best=" + best
				+ ", mcNo=" + mcNo + ", mcName=" + mcName + ", scName=" + scName + ", file=" + file + "]";
	}

}
