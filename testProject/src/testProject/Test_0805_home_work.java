package testProject;
import java.util.*;
import java.math.*;

public class Test_0805_home_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 정수하나를 입력받아 5이상의 숫자를 입력하였는지 확인하고
		* 5이상을 입력하였다면 1부터 해당수까지 순차적으로 출력하는 프로그램을 만들어라
		*/
		int num;
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		if(num < 5) {
			System.out.print("5이상의 숫자를 입력하여 주세요.");
		}else {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();		
		/* 정수 n을 입력받아 길이가 n인 1차원배열을 만들어라 
		* 해당배열에 1~n까지의 수를 차례대로 할당하고 이를 출력하는 프로그램을 작성해라
		*/
		System.out.println();
		int n;
		System.out.print("정수 : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = n++;
			System.out.print(arr[i] + " ");
		}
	    
		
	}
}

	


