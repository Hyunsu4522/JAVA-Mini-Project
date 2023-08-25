package testProject;
import java.util.*;

public class Test_0731_array_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		int num;
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		num = sc.nextInt();
		
		switch(num) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.print(days[num] + "요일");
				break;
			default:
				System.out.print("잘못 입력하셨습니다.");
		}

	}
}
