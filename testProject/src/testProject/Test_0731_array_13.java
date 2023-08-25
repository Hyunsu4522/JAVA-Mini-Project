package testProject;
import java.util.*;
import java.math.*;

public class Test_0731_array_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int a = 0;
		
		//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		int i = 0;
		
		while(i < arr.length) {
			//난수 입력받기
			int nan = (int)(Math.random() * 10 + 1);
			
			//난수 검사
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == nan) {
					nan = 0;
					break;
				}
			}
			
			if(nan == 0)
				continue;
			else {
				arr[i] = nan;
				i++;
			}
			System.out.print(nan + " ");
		}
	}
}

