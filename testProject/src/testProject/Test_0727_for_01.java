package testProject;
import java.util.*;

public class Test_0727_for_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		//for
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		//while
		int i = 1;
		while (i <= num ) {
			System.out.println(i);
			i++;

		}
		
	}
}