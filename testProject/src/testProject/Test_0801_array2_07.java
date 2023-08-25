package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row;
		
		System.out.print("행의 크기: ");
		char [][] arr = new char[row = sc.nextInt()][];
		
		
		for(int i = 0; i < arr.length; i++ ) {
			int col;
			System.out.print(i + "열의 크기를 입력하세요 : ");
			col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		char al = 'a';
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = al++;
				System.out.print(arr[i][j] + " ");
			}
		}
		
	}
		
}	

		
		


