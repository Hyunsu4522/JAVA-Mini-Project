package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int[][] arr = new int [4] [4];
		int num = 1;
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}

