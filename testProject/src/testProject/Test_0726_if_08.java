package testProject;
import java.util.*;

public class Test_0726_if_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String number;
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		number = sc.next();
		
		if(number.charAt(7) == '1' || number.charAt(7) == '3')
			System.out.print("남자");
		else
			System.out.print("여자");
		
		
//		Scanner sc = new Scanner(System.in);
//		char number;
//		
//		System.out.print("주민번호를 입력하세요(- 포함) : ");
//		number = sc.next().charAt(7);
//		
//		if(number == '1' || number == '3')
//			System.out.print("남자");
//		else
//			System.out.print("여자");
//		
//		System.out.print((number == '1' || number == '3') ? "남자" : "여자");
	} 
}
