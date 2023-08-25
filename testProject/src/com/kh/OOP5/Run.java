package com.kh.OOP5;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int형 변수 num을 입력받으세요
		int num = sc.nextInt();
		int sum = 0;
		//num이 홀수이면 홀수입니다. 짝수면 짝수입니다를 출력
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
		//1부터 num까지 모두 더한 합을 구해서 출력
		for(int i = 0; i < num; i++) {
			sum += (i+1);
		}
		System.out.println(sum);
		//num크기의 int형 배열을 만들고 0 ~ (num - 1)까지의 인덱스에 1 ~ num까지의 숫자를 저장하고
		//모든 배열에 저장이 잘 되었는지 출력
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
		//메인문에서 각각 객체를 하나 만들고 테스트 실행
//		Bird bird = new Bird("파랑새", 47);
//		bird.makeSound();
//		bird.fly();
//		
//		Fish fish = new Fish("광어", 12);
//		fish.makeSound();
//		fish.swim();
		
		Animal bird = new Bird("파랑새", 47);
		bird.makeSound();
		((Flyable)bird).fly();
		
		Animal fish = new Fish("광어", 12);
		fish.makeSound();
		((Swimmable)fish).swim();
		
		
	}
}
