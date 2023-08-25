package testProject;
import java.util.*;

public class Test_0727_if_switch_10 {
	public static void main(String[] args) {
		
		String grade;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		grade = sc.next();
		
		//if
		if(grade.equals("관리자")){
			System.out.print("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
		}else if(grade.equals("회원")) {
			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(grade.equals("비회원")) {
			System.out.print("게시글 조회");
		}else {
			System.out.print("잘못 입력하셨습니다.");
		
		
		
		double height, weight, bmi;
		
		System.out.print("키 (m)를 입력해 주세요 : ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		bmi = (weight / (height*height));
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.print("저체중");
		}else if (23 > bmi && bmi >= 18.5) {
			System.out.print("정상체중");
		}else if (25 > bmi && bmi >= 23) {
			System.out.print("과체중");
		}else if (30 > bmi && bmi >= 25) {
			System.out.print("과체중");
		}else {
			System.out.print("고도 비만");
		}
		
		
		int num1, num2;
		char operator;

		System.out.print("피연산자1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		operator = sc.next().charAt(0);

		//if
		if(num1 > 0 && num2 > 0) {
			if(operator == '+') {
				System.out.print(num1 + "+" + num2 + "=" + (num1 + num2));
			}else if(operator == '-') {
				System.out.print(num1 + "-" + num2 + "=" + (num1 - num2));
			}else if(operator == '*') {
				System.out.print(num1 + "*" + num2 + "=" + (num1 * num2));
			}else if(operator == '/') {
				System.out.print(num1 + "/" + num2 + "=" + ((double)num1 / num2));
//				System.out.printf("%d %c %d = %.6f \n", num1, operator, num2, ((double)num1 / num2));
			}else if(operator == '%') {
				System.out.print(num1 + "%" + num2 + "=" + (num1 % num2));
			}else {
				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		
		

		int mid, end, task, attendance;
		float total;
		

		
		System.out.print("중간 고사 점수 : ");
		mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		end = sc.nextInt();
		System.out.print("과제 점수 : ");
		task = sc.nextInt();
		System.out.print("출석 회수 : ");
		attendance = sc.nextInt();
		
		System.out.println("================ 결과 ================");
		System.out.println("중간 고사 점수(20) :" + (mid * 0.2));
		System.out.println("기말 고사 점수(30) :" + (end * 0.3));
		System.out.println("과제 점수	(30) :" + (task * 0.3));
		System.out.println("출석 점수	(20) :" + (float)attendance);
		total = (mid * 0.2f) + (end * 0.3f) + (task * 0.3f) + attendance;
		
		System.out.println("총점 :" + total);
		
		if(total < 70) {
			System.out.println("Fail [점수미달]");
		}else if ((20 - attendance) >= (20 * 0.3)) {
		//else if (attendance) >= (20 * 0.7)) {
			System.out.println("Fail [출석횟수미달]");
		}else {
			System.out.println("Fail");
		}
	}
		
	}
}
