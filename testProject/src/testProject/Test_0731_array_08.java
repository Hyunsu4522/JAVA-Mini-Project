package testProject;
import java.util.*;

public class Test_0731_array_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, count = 0;
		
		int[] arr;
		
		while(true){
			
			System.out.print("정수 : ");
			num = sc.nextInt();
			
			
			
			if(num % 2 == 1 && num >= 3) {
				arr =  new int[num];
				// 0 ~ (n - 1)까지 단 반복중간값까지는 1부터 1씩 늘려저장 중간이후는 1씩 빼서 저장
				for(int i = 0; i < num; i++) {
					if((num / 2) < i) {
						count--;
					}else {
						count++;
					}
					arr[i] = count;
				}
				for(int i = 0; i < num; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else { 
				System.out.print("다시 입력하세요.");
			}
		}
		
		
		
		
		
		
		
	}
}
