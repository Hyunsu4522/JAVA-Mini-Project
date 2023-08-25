package testProject;
import java.util.*;

public class Test_0726_if_02 {
	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		
		if (num % 2 == 0)
			System.out.print("짝수다");
		else
			System.out.print("홀수다.");
	} 
}
