package com.kh.practice.point;
import java.util.Scanner;

public class PointMenu {
	private Scanner sc;
	private CircleController cc;
	private RectangleController rc;
	
	public PointMenu() {
		sc = new Scanner(System.in);
		cc = new CircleController();
		rc = new RectangleController();
	}
	
	public void mainMenu(){
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum){
			case 1 :
				circleMenu();
				break;
			case 2 :
				rectangleMenu();
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	public void circleMenu(){
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum){
			case 1 :
				calcCircum();
				break;
			case 2 :
				calcCircleArea();
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
			
		}
	}
	public void rectangleMenu(){
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch(menuNum){
			case 1 :
				calcPerimeter();
				break;
			case 2 :
				calcRectArea();
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	public void calcCircum(){
		System.out.println("X 좌표: ");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("반지름: ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, radius));
		
	}
	public void calcCircleArea(){
		System.out.println("X 좌표: ");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("반지름: ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	public void calcPerimeter(){
		System.out.println("X 좌표: ");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("높이: ");
		int height = sc.nextInt();
		System.out.println("너비: ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, width, height));
	}
	public void calcRectArea(){
		System.out.println("X 좌표: ");
		int x = sc.nextInt();
		System.out.println("Y 좌표: ");
		int y = sc.nextInt();
		System.out.println("높이: ");
		int height = sc.nextInt();
		System.out.println("너비: ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, width, height));
	}


}
