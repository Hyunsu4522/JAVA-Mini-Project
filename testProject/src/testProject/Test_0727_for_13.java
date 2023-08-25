package testProject;
import java.util.*;

public class Test_0727_for_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		//몇줄 실행할 것인가? 세로
		for (int i = 1; i <= num; i++) {
			//몇번 실행하고 싶은가? 가로
			for (int j = 0; j <i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}