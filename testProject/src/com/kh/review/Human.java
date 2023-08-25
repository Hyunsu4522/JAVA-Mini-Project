package com.kh.review;

public class Human {
	private String name; //이름
	private int age; //나이
	private String residentNumber; //주민등록번호
	private char gender; //성별 f => 여자 or m => 남자
	private Book[] bookList;
	
	public Human() {
		
	}
	
	public Human(String name, int age, String residentNumber, char gender) {
		this.name = name;
		this.age = age;
		this.residentNumber = residentNumber;
		this.gender = gender;
		bookList = new Book[10];
	}
	
	
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getResidentNumber() {
		return this.residentNumber;
	}
	public char getGender() {
		return this.gender;
	}
	public Book[] getBookList() {
		return this.bookList;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setResidentNumber(String residentNumber) {
		this.residentNumber = residentNumber;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return this.name + " " + this.age + this.residentNumber + this.gender;
	}
	
	public String getFutureAge () {
		return "제 10년후 나이는" + (this.age + 10) + "살 입니다.";
	}
}
