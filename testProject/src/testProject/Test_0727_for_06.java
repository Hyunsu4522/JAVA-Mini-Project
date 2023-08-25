package testProject;
import java.util.*;

public class Test_0727_for_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, min, max;
		
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			//1 ~ 10 까지
			//작은수부터 큰수까지
			
			if (num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			for(int i = min; i <= max; i++) {
//			for (int i = (num1 > num2 ? num2 : num1); i <= (num1 > num2 ? num2 : num1); i++) {
				System.out.print(i + "");
			}
		}else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
		
		
	}
}