package testProject;
import java.util.*;

public class Test_0727_if_switch_09 {
	public static void main(String[] args) {

		int mid, end, task, attendance;
		float total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		end = sc.nextInt();
		System.out.print("과제 점수 : ");
		task = sc.nextInt();
		System.out.print("출석 회수 : ");
		attendance = sc.nextInt();
		
		System.out.println("================ 결과 ================");
		System.out.println("중간 고사 점수(20) :" + (mid * 0.2));
		System.out.println("기말 고사 점수(30) :" + (end * 0.3));
		System.out.println("과제 점수	(30) :" + (task * 0.3));
		System.out.println("출석 점수	(20) :" + (float)attendance);
		total = (mid * 0.2f) + (end * 0.3f) + (task * 0.3f) + attendance;
		
		System.out.println("총점 :" + total);
		
		if(total < 70) {
			System.out.println("Fail [점수미달]");
		}else if ((20 - attendance) >= (20 * 0.3)) {
		//else if (attendance) >= (20 * 0.7)) {
			System.out.println("Fail [출석횟수미달]");
		}else {
			System.out.println("Fail");
		}
	}

}
