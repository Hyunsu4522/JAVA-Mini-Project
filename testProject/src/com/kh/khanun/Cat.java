package com.kh.khanun;

public class Cat extends Animal {
	public Cat(String name, int age, String gender) {
		super(name ,age, gender);
	}
	public void welcomHome() {
		System.out.print("숨는다.");
	}
	void makeSound () {
		System.out.print("야옹");
	}
}

