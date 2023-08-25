package com.kh.OOP6;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int형 변수 num을 입력받으세요
		//num이 10보다 크면 "10초과" 작거나 같으면 "10이하" 출력
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num <= 10) {
			System.out.println("10이하");
		}else {
			System.out.println("10초과");
		}
		
		//1000에서 1부터 num까지 순서대로 전부 뺀 값을 출력
		int sum = 1000;
		for(int i = 1; i <= num; i++) {
				sum -= i;
			}
			System.out.println(sum);
		
		//num크기의 int형 배열을 만들고 모든 인덱스에 num의 숫자를 저장하고
		//모든 배열에 저장이 잘 되었는지 출력
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
		
		//메인문에서 각각 객체를 하나 만들고 테스트 실행
		Human kim = new Student("김민수", 20);
		kim.makeSound();
		//다운캐스팅
		((Student)kim).sleep();
		((Student)kim).swim();
	}
}

