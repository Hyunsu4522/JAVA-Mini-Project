package com.kh.iclass;
import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		cafePos pos = cafePos.getInstance();
		//메뉴생성, 삭제, 수정, 조회, 전체출력

		
		while(pos.getIsRun()) {
			int number = pos.printMenu();
			switch(number) {
				case 1:{//생성
					pos.insertMenu();
				}break;
				case 2:{//수정
					pos.updateDrinkUnit();
				}break;
				case 3:{//조회
					pos.searchDrinkUnit();
				}break;
				case 4:{//삭제
					pos.deleteDrinkUnit();
				}break;
				case 5:{//전체 메뉴 조회
					pos.printDrinkArr();
				}break;
				default:
					pos.setIsRun(false);
			}
		}
		
		
		
//		final int MAX = 20;
//		Product[] menuArr = new Product[MAX];

		//음료명, 금액, 설명을 입력받아 menuArr에 추가해 보아라
		//음료명을 입력하세요.
		//금액을 입력하세요.
		//설명을 입력하세요.
		//ooo가 메뉴에 추가되었습니다.
		//또는 ooo은 이미 등록되어있습니다.
//		String name, description; 
//		int price; 
//		
//		System.out.print("음료명을 입력하세요. : ");
//		name = sc.next();
//		System.out.print("금액을 입력하세요. : ");
//		price = sc.nextInt();
//		System.out.print("설명을 입력하세요. : ");
//		description = sc.next();
//		
//		for(int i =0; i < menuArr.length; i++) {
//			if(menuArr[i] == null) {// 객체에 자리가 비어있니?
//				menuArr[i] = new Product(name, price, description);
//				System.out.println(menuArr[i].getName() + "가 메뉴에 추가되었습니다.");
//				break;
//			}else if(menuArr[i].getName().equals(name)) {//객체에 이름데이터의 값이 입력받은 이름과 똑같니?
//				System.out.println(name + "은 이미 등록되어있습니다.");
//				break;
//			}else if(i == (menuArr.length - 1)){//마지막까지 확인이 끝났니?
//				System.out.println("더이상 메뉴를 추가할 수 없습니다.");
//			}
//		}
		
		// 음료목록 출력해주세요.
		// 메뉴명 가격 설명
//		System.out.println("메뉴명\t가격\t설명");
////		for(int i = 0; menuArr[i] != null && i < menuArr.length; i++) {
////			System.out.print(menuArr[i].toString());
////		}
//		for(int i = 0; i < menuArr.length; i++) {
//			if(menuArr[i] == null) {
//				System.out.println(i + "\t-\t-\t-");
//			}else {
//				System.out.println(menuArr[i].toString());
//			}
//			
//		}
		
		//가장 최신으로 저장된 목록 1개 삭제
//		for(int i = menuArr.length - 1; i >= 0; i--) {
//			if(menuArr[i] == null) {
//				System.out.print(menuArr[i].getName() + "가 메뉴가 삭제되었습니다.");
//				menuArr[i] = null;
//				break;
//			}else if (i == 0) {
//				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
//			}
//		}
		
		//조회
		//조회할 메뉴의 이름을 입력하세요
//		System.out.print("조회할 메뉴의 이름을 입력하세요: ");
//		String search = sc.next();
//		
//		for(int i = 0; i < menuArr.length; i++) {
//			if(menuArr[i] == null) {
//				System.out.print("해당메뉴가 목록에 존재하지 않습니다. : ");
//				break;
//			}else if(menuArr[i].getName().equals(search)) {
//				System.out.println(i + "\t" +menuArr[i].toString());
//				break;
//			}else if(i == (menuArr.length - 1)) {
//				System.out.print("해당메뉴가 목록에 존재하지 않습니다. : ");
//			}
//		}
		
		//수정할 메뉴의 번호를 입력하세요 : 0
		//수정할 정보를 입력하세요 : (이름, 가격, 설명)
		//새로운 oo을 입력하세요 dddd
		//selectMenu이용해서 해당정보 수정 후 아래와 같이 출력
		//(번호) 아메리카노 1000 시원해요
		
//		Product selectMenu;
//		int number;
//		System.out.print("수정할 메뉴의 번호를 입력하세요 : ");
//		number = sc.nextInt();
//		selectMenu = menuArr[number];
//		
//		if(selectMenu == null) {
//			System.out.print("해당메뉴가 목록에 존재하지 않습니다. : ");
//		}else{
//			System.out.print("수정할 정보를 입력하세요 (이름, 가격, 설명): ");
//			switch(sc.next()) {
//				case "이름":
//					sc.nextLine();
//					System.out.print("새로운 이름을 입력하세요. : ");
//					selectMenu.setName(sc.nextLine());
//					System.out.print(number + "\t" + selectMenu.toString());
//					break;
//				case "가격":
//					System.out.print("새로운 가격을 입력하세요. : ");
//					selectMenu.setPrice(sc.nextInt());
//					System.out.print(number + "\t" + selectMenu.toString());
//					break;
//				case "설명":
//					sc.nextLine();
//					System.out.print("새로운 설명을 입력하세요. : ");
//					selectMenu.setDescription(sc.nextLine());
//					System.out.print(number + "\t" + selectMenu.toString());
//					break;
//				default:
//					System.out.print("잘못입력하셨습니다.");
//			}
//		}		

		
		
		
//		Product selectMenu;
//		for(int i = 0; i < menuArr.length; i++) {
//			if(menuArr[i] == null) {
//				System.out.print("해당메뉴가 목록에 존재하지 않습니다. : ");
//				break;
//			}else if(menuArr[i].getName().equals(search)) {
//				System.out.println(i + "\t" + menuArr[i].toString());
//				selectMenu = menuArr[i];
//				break;
//			}else if(i == (menuArr.length - 1)) {
//				System.out.print("해당메뉴가 목록에 존재하지 않습니다. : ");
//			}
//		}
		
		

		
		//아이스아메리카노, 카페라떼, 핫쵸코
//		Product iceAme = new Product("아이스 아메리카노", 2000, "산미가 있는 아이스 아메리카노");
//		Product latte = new Product("카페 라떼", 2500, "고소한 카페 라떼");
//		Product hotChoco = new Product("핫쵸코", 3000, "찐한 핫쵸코");
		
//		System.out.println(iceAme.toString());
//		System.out.println(latte.toString());
//		System.out.println(hotChoco.toString());
		
		//객체배열 생성하는 방법
//		Product[] menuArr = new Product[3];
//		menuArr[0] = new Product("아이스 아메리카노", 2000, "산미가 있는 아이스 아메리카노");
//		menuArr[1] = new Product("카페 라떼", 2500, "고소한 카페 라떼");
//		menuArr[2] = new Product("핫쵸코", 3000, "찐한 핫쵸코");
		
//		System.out.println(menuArr[0].toString());
//		System.out.println(menuArr[1].toString());
//		System.out.println(menuArr[2].toString());
//		for(int i = 0; i < menuArr.length; i++) {
//			menuArr[i].toString();
//		}
		
	}
}
