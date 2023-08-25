package com.kh.OOP3;

public class Cat implements Animal{
	public void eat (String food) {
		System.out.print(food + "가 너무 맛있다(야옹)");
	}
	public void move() {
		System.out.print("야옹(꼬리를 흔들며)");
	}
}
