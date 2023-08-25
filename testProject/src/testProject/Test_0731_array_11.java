package testProject;
import java.util.*;
import java.math.*;

public class Test_0731_array_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Math.random() : 0보다 크고 1보다 작은 난수 발생
		//값을 곱하고 int형으로 변환해서 정수형 난수를 발생시킬 수 있다.
//		System.out.print((int)(Math.random() * 10));
		

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

