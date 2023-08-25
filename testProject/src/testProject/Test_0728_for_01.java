package testProject;
import java.util.*;

public class Test_0728_for_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		if(num < 1) {
			System.out.print("양수가 아닙니다.");
		}else {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print("수");
				}else {
					System.out.print("박");
				}
			}
		}
		
		
			

	}
}