package com.javaex.vo;

public class ProductVo {

	private int productNo;
	private int scNo;
	private String productName;
	private int price;
	private int storage;
	private String detail;
	private String saveName;
	private int best;

	public ProductVo() {
		super();
	}

	public ProductVo(int productNo, int scNo, String productName, int price, int storage, String detail,
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

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
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

	@Override
	public String toString() {
		return "ProductVo [productNo=" + productNo + ", scNo=" + scNo + ", productName=" + productName + ", price="
				+ price + ", storage=" + storage + ", detail=" + detail + ", saveName=" + saveName + ", best=" + best
				+ "]";
	}

}
