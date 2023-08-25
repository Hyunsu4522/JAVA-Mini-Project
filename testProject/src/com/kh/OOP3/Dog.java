package com.kh.OOP3;

public class Dog implements Animal{
	public void eat (String food) {
		System.out.print(food + "가 너무 맛있다(멍멍)");
	}
	public void move() {
		System.out.print("멍멍(꼬리를 흔들며)");
	}
}
