package testProject;
import java.util.*;

public class Test_0727_for_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = 0;
		while(num < 1) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				int i = 1;
				while(i <= num) {
					System.out.print(i+ "");
					i++;
				}
			}
		}
		
		//do ~ while
//		int num = 0;
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if(num < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}else {
//				int i = 1;
//				while(i <= num) {
//					System.out.print(i+ "");
//					i++;
//				}
//			}
//		}while(num < 1);
//
	}
}