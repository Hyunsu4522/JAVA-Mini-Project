package testProject;
import java.util.*;

public class Test_0726_if_01 {
	public static void main(String[] args) {
		
		int num; 
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num >= 100)
			System.out.print("세자리수 이상입니다.");
		else
			System.out.print("세자리수 미만입니다.");
	}
}
