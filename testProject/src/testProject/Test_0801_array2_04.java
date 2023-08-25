package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[][] arr = new int[4][4];
		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(j == (arr[0].length - 1)) {
//					break;
//				}
//				arr[i][j] = (j + 1);
//				arr[i][3] += arr[i][j];
//			}
//			arr[3][0] += arr[i][0];
//			arr[3][1] += arr[i][1];
//			arr[3][2] += arr[i][2];
//		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < (arr[i].length - 1); j++) {
				arr[i][j] = (j + 1 + (i * 3));
				arr[i][3] += arr[i][j];
				arr[3][3] += arr[i][j];   
			}
			arr[3][0] += arr[i][0];
			arr[3][1] += arr[i][1];
			arr[3][2] += arr[i][2];
			arr[3][3] += arr[i][0];
			arr[3][3] += arr[i][1];
			arr[3][3] += arr[i][2];
			
		}
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = arr[0][0] + arr[0][1] + arr[0][2];
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[1][3] = arr[1][0] + arr[1][1] + arr[1][2];
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		arr[2][3] = arr[2][0] + arr[2][1] + arr[2][2];
		
		arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
		arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
		arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];
		
		arr[3][3] = arr[3][0] + arr[3][3] + arr[3][2]+
				    arr[0][3] + arr[1][3] + arr[2][3];
		
		
		}
	}
	


