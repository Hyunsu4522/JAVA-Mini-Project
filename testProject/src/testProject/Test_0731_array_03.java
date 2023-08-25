package testProject;
import java.util.*;

public class Test_0731_array_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("양의 정수 : ");
		num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
		

	}
}
