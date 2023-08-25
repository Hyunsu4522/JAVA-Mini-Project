package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//방법1
//		String[][] arr = new String [3][3];
		
//		arr[0][0] = "(0, 0)";
//		arr[0][1] = "(0, 1)";
//		arr[0][2] = "(0, 2)";
//		arr[1][0] = "(1, 0)";
//		arr[1][1] = "(1, 1)";
//		arr[1][2] = "(1, 2)";
//		arr[2][0] = "(2, 0)";
//		arr[2][1] = "(2, 1)";
//		arr[2][2] = "(2, 2)";
		
		//방법2
//		String[][] arr = {{"(0, 0)","(0, 1)","(0, 2)"},{"(1, 0)","(1, 1)","(1, 2)"},{"(2, 0)","(2, 1)","(2, 2)"}};
		
		//방법3
//		String[][] arr = new String [3][3];
//		
//		for(int i=0; i < arr.length; i++) {
//			for(int j=0; j < arr[i].length; j++) {
//				arr[i][j] = "(" + i + ", " + j + ")";
//				System.out.print(arr[i][j]);
//			}
//		}
		
		
		
//		arr[0][0] = 'a';
//		arr[0][1] = 'b';
//		arr[0][2] = 'c';
//		arr[1][0] = 'd';
//		arr[1][1] = 'e';
//		arr[1][2] = 'f';
//		arr[2][0] = 'g';
//		arr[2][1] = 'h';
//		arr[2][2] = 'i';
		
		char[][] arr = new char [3][3];
		char ch = 'a';
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	
}

