package testProject;
import java.util.*;

public class Test_0727_for_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start,term;
		
		System.out.print("시작 숫자 : ");
		start = sc.nextInt();
		System.out.print("공차 : ");
		term = sc.nextInt();
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(start + " ");
			start = start + term;
		}
		
		
	}
}