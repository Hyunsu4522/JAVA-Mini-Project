package testProject;
import java.util.*;

public class Test_0726_if_switch_01 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int number; 
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
	
		System.out.print("메뉴 번호를 입력하세요 : ");
		number = sc.nextInt();
		
		//if
		
		if (number == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if (number == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if (number == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if (number == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if (number == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		//switch
		
		switch(number) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		
	}
}
