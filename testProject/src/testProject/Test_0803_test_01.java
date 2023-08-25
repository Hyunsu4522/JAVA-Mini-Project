package testProject;
import java.util.*;

public class Test_0803_test_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//			int num1, num2, num3;
//			int sum = 0;
//			double a = 0;
//
//			System.out.print("국어 : ");
//			num1 = sc.nextInt();
//			System.out.print("영어 : ");
//			num2 = sc.nextInt();
//			System.out.print("수학 : ");
//			num3 = sc.nextInt();
//			System.out.println();
//			
//			
//			sum = num1 + num2+ num3;
//			a = sum / 3;
//			
//			
//			System.out.println("합계 : " + sum);
//			System.out.print("평균 : " + a);
//			if(num1 > 50 && num2 > 50 && num3 > 50 && sum / a > 60)
//			System.out.println("\n합격");
//			else
//			System.out.println("\n불합격");
			
			int num;
			do {
				System.out.print("1이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
			
				if(num >= 1) {
					for(int i = num; i >= 1; i--) {
						System.out.print(i+ " ");
					}
					break;
				}else {
					System.out.println("1이상의 숫자를 입력해주세요.");
				}
			}while(true);
			
			
			
			
	}
}