package testProject;
import java.util.*;
import java.math.*;

public class Test_0803_test_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		//double형 변수 num을 생성하고 3.75를 대입해라
//		double num = 3.75;
//		//int형 변수 num2를 생성하고 숫자를 하나 입력받아라
		int num2;
		System.out.print("정수 : ");
		num2 = sc.nextInt();
//		//입력받은 num2(길이)를 활용하여 1차원 배열 arr을 하나 만들고 모든 수를 5로 초기화한다
//		//arr배열의 2 인덱스 값에 0을 넣어준다
		int[] arr = new int [num2];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 5;
			arr[2] = 0;
			System.out.print(arr[i] + " ");
		}
		
//		//arr배열 처음부터 끝까지 아래와 같은 방식으로 출력한다.
//		//배열안에 값이 5일때 5출력
//		//배열안에 값이 0일때 "5가 아닙니다"
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 5)
			System.out.print("5" + " ");
			else
			System.out.print("5가 아닙니다" + " ");
		}
		System.out.println();
		
		
	}
}

	


