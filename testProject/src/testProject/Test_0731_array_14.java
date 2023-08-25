package testProject;
import java.util.*;
import java.math.*;

public class Test_0731_array_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1~45번 난수 생성
		//Arrays.sort(배열)//오름차순 정렬
		//Arrays.sort(배열, Collections.reverseOrder()); //내림차순 정렬
		
		int[] arr = new int[6];
		int i = 0;
		
		while(i < arr.length) {
			int nan  = (int)(Math.random() * 45 + 1);
			
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
			//for문 두개 이용
			//for(i = 0; i< arr.length; i++) {
//				arr[i] = (int)(Math.random() * 45 + 1);
//				for (int j = 0; j < i; j++) {
//					if(arr[i] == arr[j]) {
//						i--;
//						break;
//				}
//					
			//}
		}
					
		Arrays.sort(arr);
		
		for(i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
			
		
		
		
	}
}



