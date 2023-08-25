package testProject;
import java.util.*;
import java.math.*;

public class Test_0731_array_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min= 11, max = 0;
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
//			max = (arr[i] > max) ? arr[i] : max;
//			min = (arr[i] < min) ? arr[i] : min;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		

		System.out.println();
		System.out.println("최대값 :" + max);
		System.out.println("최솟값 :" + min);	

		
	}
}

