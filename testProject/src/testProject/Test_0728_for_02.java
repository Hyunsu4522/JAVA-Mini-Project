package testProject;
import java.util.*;

public class Test_0728_for_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		//do~while문
		
//		 do{
//			System.out.print("정수 : ");
//			num = sc.nextInt();
//			
//			if(num < 1)
//				System.out.println("양수가 아닙니다.");
//			else {
//				for(int i = 1; i <= num; i++) {
//					if(i % 2 == 0) {
//						System.out.print("수");
//					}else {
//						System.out.print("박");
//					}
//				}
//			}
//	
//		 }while(num < 1);
		
		//while문
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			
			if(num < 1)
				System.out.println("양수가 아닙니다.");
			else {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 0) {
						System.out.print("수");
					}else {
						System.out.print("박");
					}
					break;
				}
			}

		}
	}
}