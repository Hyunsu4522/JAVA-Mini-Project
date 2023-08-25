package testProject;
import java.util.*;

public class Test_0727_for_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, min, max;
		
		
		
//		if(num1 > 0 && num2 > 0) {
//			if (num1 > num2) {
//				max = num1;
//				min = num2;
//			}else {
//				max = num2;
//				min = num1;
//			}
//			for(int i = min; i <= max; i++) {
//				System.out.print(i + "");
//			}
//		}else {
//			System.out.print("1 이상의 숫자를 입력해주세요.");
//		}
		
		int num = 0;
		
		while(num < 1) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				if(num1 > 0 && num2 > 0) {
					if (num1 > num2) {
						max = num1;
						min = num2;
					}else {
						max = num2;
						min = num1;
					}
					for(int i = min; i <= max; i++) {
						System.out.print(i + "");
					}
				}
				
			}
			
			
		}
		
		
	}
}