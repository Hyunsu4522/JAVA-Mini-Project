package com.kh.extendsjava;

public class Man {
	String name;
	
	public Man() {
		System.out.println("Man 생성");
	}
	
	public Man(String name) {
		this.name = name;
		System.out.println("name 넘겨받아 Man 생성");
	}
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}
