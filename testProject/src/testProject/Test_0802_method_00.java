package testProject;
import java.util.*;
import java.math.*;

public class Test_0802_method_00 {
	public static void main(String[] args) {
	//매서드 설정값  리턴형식 메서드이름(매개변수)
		Scanner sc = new Scanner(System.in);
		
		//메소드의 이름이 main, 중괄호 내 문장들이 순차적으로 실행
		//프로그램의 시작은 main(자바에서 정한 규칙)
	
		
//		System.out.println("프로그램의 시작");
//		hiEverone(12);//값을 전달하는 값 = 인자
//		hiEverone(13);
//		System.out.println("프로그램의 끝");
//	}
//	public static void hiEverone(int age) {//매개변수 : 꼭 필요한건 아님
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 " + age + "세 입니다.");
//	}	
		
		//매개변수 0개, 2개인 메소드
//		double  myHeight = 175.9;
//		hiEverone(12, 12.5);
//		hiEverone(13, myHeight);
//		byEveryone();
//	}	
//	public static void hiEverone(int age, double height) {
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("저의 키는 " + height + "cm 입니다.");
//	}
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다.");
//	}
		
		//값을 반환하는 메소드
		//void -> 값을 반환하지 않음
		
//		int  result;
//		result = adder(4, 5);
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 x 3.5 = " + square(3.5));
//	}
//	public static int adder(int num1, int num2) {
//		int  adderresult = num1 + num2;
//		return adderresult;
//	}
//	public static double square(double num) {
//		return num * num;
//	}
	
		//재귀 호출
//		System.out.print(factorial(3));	
//	}
//		
//		public static int factorial(int n) {
//			if(n == 1)
//				return 1;
//			else
//				return n * factorial(n-1);
//		}
		
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//		BankAccount tmp;
//		
//		System.out.println(yoon.balance);
//		System.out.println(park.balance);
//		
//		yoon.deposit(1000);
//		park.deposit(2000);
//		
//		tmp = yoon;
//		yoon = park;
//		park = tmp;
//		tmp = null;
//		yoon.checkMyBalance();
//		park.checkMyBalance();
		
//		BankAccount ref = new BankAccount();
//		ref.deposit(3000);
//		ref.withdraw(300);
//		check(ref);
		

		//기본생성자로 객체 생성 해서 이름, 잔액 출력
		BankAccount park = new BankAccount();
		System.out.println(park.balance);
		System.out.println(park.name);
	
		//매개변수가 2개인 생성자로 객체 셍성하고 이름, 잔액 출력
		
		
	}

}

class BankAccount{
	int balance;
	String name;
	public BankAccount() {
		balance = 0;
		name = "이름없음";
	}
	
	public BankAccount(int b, String n) {
		balance = b;
		name = n;
	}
	
	
//	int balance = 0; 
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액 :" + balance);
		return balance;
	}
	
//	public static void check(BankAccount acc) {
//		acc.chekMyBalance();
//	}

}

	


