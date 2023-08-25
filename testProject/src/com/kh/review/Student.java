package com.kh.review;

public class Student {
	private int group; //반
	private int number;  //번호
	private String name; //이름
	
	//getter
	public int getGroup() {
		return this.group;
	}
	public int getNumber() {
		return this.number;
	}
	public String getName() {
		return this.name;
	}
	
	//setter
	public void setGroup(int group) {
		this.group = group;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.group + " " + this.number + " " + name;
	}
}
