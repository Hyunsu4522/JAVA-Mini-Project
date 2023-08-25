package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row, col;
		
		do {
			System.out.print("행의 크기(1 ~ 10)를 입력하세요 : ");
			row = sc.nextInt();
			
			if(row < 1 || row > 10)
				System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}while(row < 1 || row > 10);
		
		
		do {
			System.out.print("열의 크기(1 ~ 10)를 입력하세요 : ");
			col = sc.nextInt();
			
			if(col < 1 || col > 10)
			System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}while(col < 1 || col > 10);
		
		char[][] arr = new char[row][col];
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)(Math.random() * 26 + 65);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
				
		
		}
	}
	


