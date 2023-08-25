package testProject;
import java.util.*;

public class Test_0726_if_03 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0)
			System.out.print("양수아니다.");
		else if (num == 0)
			System.out.print("0이다.");
		else
			System.out.print("양수다.");
	} 
}
