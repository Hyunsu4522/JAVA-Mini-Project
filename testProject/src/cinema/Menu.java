package cinema;

public class Menu {
	String popcorn; //팝콘
	String dirnk; //음료
	String squid; //오징어
	String sanck; //스낵
	
	int custpop; //손님의 팝콘 
	int custdirnk; //손님의 음료
	int custpart; //손님이 선택한 오징어 부위
	String custSideMenu; //손님이 선택한 사이드메뉴
	
	public Menu() {
			
	}
	
	public Menu(String popcorn, String dirnk, String squid, String sanck) {
		this.popcorn = popcorn;
		this.dirnk = dirnk;
		this.squid = squid;
		this.sanck = sanck;
	}
		
	public int Taste(int tCustpop) {
		if(tCustpop == 1) {
			System.out.println("손님이 선택하신 팝콘은 갈릭맛 팝콘 입니다.");
		}else if (tCustpop == 2){
			System.out.println("손님이 선택하신 팝콘은 치즈맛 팝콘 입니다.");
		}
		else if (tCustpop == 3){
			System.out.println("손님이 선택하신 팝콘은 어니언맛 팝콘 입니다.");
		}
		else if (tCustpop == 4){
			System.out.println("손님이 선택하신 팝콘은 카라멜맛 팝콘 입니다.");
		}else {
			System.out.println("잘못선택하셨습니다.");
		}return custpop;
	}
	
	public int Type(int tCustdirnk) {
		if(tCustdirnk == 1) {
			System.out.println("손님이 선택하신 음료는 콜라 입니다.");
		}else if (tCustdirnk == 2){
			System.out.println("손님이 선택하신 음료는 사이다 입니다.");
		}
		else if (tCustdirnk == 3){
			System.out.println("손님이 선택하신 음료는 아메리카노 입니다.");
		}
		else if (tCustdirnk == 4){
			System.out.println("손님이 선택하신 음료는 환타 입니다.");
		}else {
			System.out.println("잘못선택하셨습니다.");
		}return custdirnk;
	}
	
	public int Part(int tPart) {
		if(tPart == 1) {
			System.out.println("손님이 선택하신 오징어 부위는 몸통 입니다.");
		}else if (tPart == 2){
			System.out.println("손님이 선택하신 오징어 부위는 다리 입니다.");
		}else {
			System.out.println("잘못선택하셨습니다.");
		}return custpart;
	}
	
	public String SideMenu (String tSideMenu) {
		System.out.println("손님이 선택하신 사이드 메뉴는 " + tSideMenu + " 입니다.");
		return custSideMenu;
	}
	
	public void ordeMenu() {
		System.out.println("손님이 선택하신 팝콘은 " + this.popcorn + "맛 팝콘 입니다.");
		System.out.println("손님이 선택하신 음료는 "+ this.dirnk + " 입니다.");
		System.out.println("손님이 선택하신 오징어 부위는 "+ this.squid + " 입니다.");
		System.out.println("손님이 선택하신 스낵종류는 "+ this.sanck + " 입니다.");

	}
}
