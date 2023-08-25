package cinema;
import java.util.*;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Menu customer1 = new Menu("갈릭", "아메리카노", "몸통", "나쵸");

		customer1.ordeMenu();
		
		System.out.println();
		boolean isFinish = false;
		while(!isFinish) {
			int num;
			System.out.println();
			System.out.println("원하시는 메뉴의 버튼을 클릭하세요.");
			System.out.println("--------------------------");
			System.out.println("1. 팝콘");
			System.out.println("2. 음료");
			System.out.println("3. 오징");
			System.out.println("4. 스낵");
			System.out.println("다른버튼을 누르면 종료");
			System.out.println("--------------------------");
			
			num = sc.nextInt();
			switch(num) {
				case 1:
					System.out.println("어떤맛 팝콘을 드시겠습니까?");
					System.out.println("1. 갈릭");
					System.out.println("2. 치즈");
					System.out.println("3. 어니언");
					System.out.println("4. 카라멜");
					int custpop = sc.nextInt();
					customer1.Taste(custpop);
					break;
				case 2:
					System.out.println("어떤 음료를 드시겠습니까?");
					System.out.println("1. 콜라");
					System.out.println("2. 사이다");
					System.out.println("3. 아메리카노");
					System.out.println("4. 환타");
					int custdirnk = sc.nextInt();
					customer1.Type(custdirnk);
					break;
				case 3:
					System.out.println("어느부위를 드시겠습니까?");
					System.out.println("1. 몸통");
					System.out.println("2. 다리");
					int custpart = sc.nextInt();
					customer1.Part(custpart);
					break;
				case 4:
					System.out.println("원하시는 스낵종류를 입력해주세요.");
					String custSideMenu = sc.next();
					customer1.SideMenu(custSideMenu);
					break;
				default:
					isFinish = true;
			}
		
		}
		
		
		
		MovieSelect customer = new MovieSelect();
		
	
		customer.MovieSelect();
		
		boolean isSelect = false;
		while(!isSelect) {
			int num2;
			System.out.println();
			System.out.println("영화를 선택하시겠습니까?");
			System.out.println("--------------------------");
			System.out.println("1. 예.");
			System.out.println("2. 아니요.");
			System.out.println("이외 다른버튼을 누르면 종료");
			System.out.println("--------------------------");

			num2 = sc.nextInt();
			switch(num2) {
				case 1:
					System.out.println("원하시는 영화를 선택해 주세요.");
					System.out.println("1. 밀수");
					System.out.println("2. 콘크리트 유토피아");
					System.out.println("3. 비공식작전");
					System.out.println("4. 엘리멘탈");
					System.out.println("다른버튼을 누르면 종료");
					int custmovie = sc.nextInt();
					customer.Movie(custmovie);
					
	
					char ch;
					int num3;
					System.out.println("원하시는 좌석을 입력해 주세요.");
					ch = sc.next().charAt(0);
					System.out.println("원하시는 좌석 번호를 입력해 주세요.");
					num3 = sc.nextInt();

					System.out.println("선택하신 좌석은 " + ch + "열 " + num3 + "번 입니다.");
					System.out.println("즐거운 관람되세요.");
					break;		
					
				case 2:
					isSelect = true;
					break;
				default:
					isSelect = true;
			}
		
		}
		
		
		
		
		
		

	}
}
