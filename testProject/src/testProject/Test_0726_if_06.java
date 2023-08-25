package testProject;
import java.util.*;

public class Test_0726_if_06 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int age;
//		String grade;
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if (age <= 13)
			System.out.print("\n어린이");
//			grade = "어린이"
		else if (age > 13 && age <= 19)
			System.out.print("\n청소년");
//			grade = "청소년"
		else
			System.out.print("\n성인");
//		grade = "성인"
//      삼항연산자
//		grade = (age <= 13) ? "어린이" : ((age > 13 && age <= 19) ? "청소년" : "성인"); 
	} 
}
