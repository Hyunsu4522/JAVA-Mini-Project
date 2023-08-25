package com.kh.OOP6;
//Student 클래스 작성
//Human을 상속받고, Swimmable, Sleepable를 구현함
//swim매서드에서는 "ooo님은 수영을 합니다." 출력
//sleep매서드에서는 "ooo님은 잠을 잡니다." 출력
//makeSound매서드에서는 "저는 ooo이고 oo살 입니다." 출력
public class Student extends Human implements Swimmable, Sleepable{
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void sleep() {
		System.out.println(super.getName() + "님은 잠을 잡니다.");
	}
	
	@Override
	public void swim() {
		System.out.println(super.getName() + "님은 수영을 합니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("저는 " + super.getName() + "이고 " + super.getAge() + "살 입니다.");
		
	}
}
