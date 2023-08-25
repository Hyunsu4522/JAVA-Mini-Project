package testProject;
import java.util.*;

public class Test_0726_if_05 {
	public static void main(String[] args) {

		int grade, classRoom, number;
		float score;
		String name, gender;
//		char gender;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		classRoom = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		number = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		gender = sc.next();
//		gender = gender == 'M' ? '남':'여';
//		gender = sc.next().charAt(0);
//		gender = (sc.next().charAt(0) == 'M') ? '남' : '여';
		
		if (gender == "M")
			gender = "남학생";
		else
			gender = "여학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		score = sc.nextFloat();
		
		System.out.print("\n"+ grade + "학년" + classRoom + "반"+ number + "번 " + name + " "+gender+"의 성적은 "+ score + "이다.");

	} 
}
