package testProject;
import java.util.*;

public class Test_0726_if_switch_02 {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다.");
		}else if (num % 2 != 0) {
			System.out.println("홀수다.");
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
	}
}
