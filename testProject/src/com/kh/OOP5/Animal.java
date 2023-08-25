package com.kh.OOP5;
//Animal 추상클래스 작성
//필드값 : String name
//필드를 초기화하는 생성자 작성
//추상메서드 makeSound : 매개변수와 반환값(리턴값)이 없음
public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal (String name, int age){
		this.name = name;
		this.age = age;
	}
	public abstract void makeSound();
}
