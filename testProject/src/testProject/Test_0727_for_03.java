package testProject;
import java.util.*;

public class Test_0727_for_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		//for
		for (int i = num; i >= 1; i--) {
			System.out.println(i);
		}

	}
}