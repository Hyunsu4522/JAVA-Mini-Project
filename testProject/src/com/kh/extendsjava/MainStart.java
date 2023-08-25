package com.kh.extendsjava;

public class MainStart {
	public static void main(String[] args) {
		//객체를 생성할때 상속받은 클래스(부모)가 있다면
		//부모 클래스의 설계부터 확인하고 자식클래스의 설계를 따른다.
//		Man choi = new Man();
//		choi.name = "jiwon";
//		choi.tellYourName();
		
		BusinessMan  kim = new BusinessMan("KH", "학생", "박수현");
		kim.tellYourInfo();
//		kim.name = "junho";
//		kim.tellYourName();
//		kim.tellYourInfo();
	}
}
