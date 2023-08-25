package com.kh.review;

public class Tea {
	private String taste; //맛
	private String temperature; //차가운거 or 뜨거운거
	private int number; //갯수
	
	//getter
	public String getTaste() {
		return this.taste;
	}
	public String getTemperature() {
		return this.temperature;
	}
	public int getNumber() {
		return this.number;
	}
	
	//setter
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return this.taste + " " + this.temperature + " " + number;
	}
	
}
