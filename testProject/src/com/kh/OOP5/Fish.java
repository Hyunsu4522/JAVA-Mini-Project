package com.kh.OOP5;
//Fish 클래스 작성
//Animal을 상속받고, Swimmable를 구현함
//swim매서드에서는 "oo는 물을 헤엄친다" 출력
//makeSound매서드에서는 "oo이 물에서 울고있습니다" 출력
public class Fish extends Animal implements Swimmable{
	
	public Fish(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void swim() {
		System.out.print(name + "는 물을 헤엄친다");
	}

	@Override
	public void makeSound() {
		System.out.println(this.name + "이 물에서 울고있습니다.");
		
	}
}