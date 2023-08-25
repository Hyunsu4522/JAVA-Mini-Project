package testProject;
import java.util.*;

public class Test_0726_if_07 {
	public static void main(String[] args) {

		int a, b, c, total;
		float avg;
//		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		a = sc.nextInt();
		System.out.print("영어 : ");
		b = sc.nextInt();
		System.out.print("수학 : ");
		c = sc.nextInt();
		
		total = a + b + c;
//		avg = total / 3;
		avg = total / (float)3;
		
		System.out.println("\n합계 : " + total);
		System.out.println("평균 : " + avg);
		
//      삼항연산자
//		str = (a > 40 && b >= 40 && c >= 40 && avg >= 60) ? "합격" : "불합격";
//		System.out.print(str);
		
		if(a > 40 && b >= 40 && c >= 40 && avg >= 60)
			System.out.print("합격");
		else
			System.out.print("불합격");
	} 
}
