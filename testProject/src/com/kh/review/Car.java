package com.kh.review;

public class Car {
	private String type; //종류(대형, 중형, 소형)
	private String color;  //색깔
	private int year; //연식
	
	
	//getter
	public String getType() {
		return this.type;
	}
	public String getColor() {
		return this.color;
	}
	public int getYear() {
		return this.year;
	}
	
	//setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type + " " + this.color + " " + year;
	}
	
	
}