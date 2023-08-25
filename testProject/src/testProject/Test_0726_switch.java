package testProject;
import java.util.*;

public class Test_0726_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		
		switch(day) {
			case "월" :
			case "화" :
			case "수" :
			case "목" :
			case "금" :
				System.out.print("금일은 정상 영업합니다.");
				break;
			case "토" :
			case "일" :
				System.out.print("금일은 휴일입니다.");
			default:
				System.out.print("잘못 입력하셨습니다.");
		}
	}
}
