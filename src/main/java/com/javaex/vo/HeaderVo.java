package com.javaex.vo;

public class HeaderVo {
	
	//필드
	private int mcNo;
	private String mcName;

	
	//생성자
	public HeaderVo() {
		super();
	}
	public HeaderVo(int mcNo, String mcName) {
		super();
		this.mcNo = mcNo;
		this.mcName = mcName;
	}
	
	//메소드-gs
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
	
	//메소드-일반
	@Override
	public String toString() {
		return "HeaderVo [mcNo=" + mcNo + ", mcName=" + mcName + "]";
	}
	
}
