package com.kh.javah;
import java.util.Scanner;


public class SOsystem {
	Scanner sc = new Scanner(System.in);
	
	private final static Book[] BOOK_LIST = new Book[10];
	private static SOsystem SoInstance = new SOsystem();
	
	private SOsystem() {
		
	}
	
	public static SOsystem getSOInstance() {

		return SoInstance;
	}
	
	public int printBookList(){
		System.out.println();
		System.out.println("원하시는 메뉴의 버튼을 클릭하세요.");
		System.out.println("-------------------------------");
		System.out.println("1. 도서등록");
		System.out.println("2. 도서삭제");
		System.out.println("3. 전체도서목록조회");
		System.out.println("4. 도서검색 (이외 다른버튼을 누르면 종료)");
		System.out.println("5. 도서 정보 수정");
		System.out.println("-------------------------------");
		
		return sc.nextInt();
	}
	
	public void addBook() {
		if(this.BOOK_LIST[this.BOOK_LIST.length - 1] != null){
			System.out.print("더이상 도서를 등록할 수 없습니다.");
			return;
		}
		saveBook(insertBook());
	}
	
	public Book insertBook() {
		String bookclass, bookregist, bookname;
		int bookcode;
		
		System.out.print("분류 : ");
		bookclass = sc.next();
		
		System.out.print("분류코드 :");
		bookcode = sc.nextInt();
		
		System.out.print("등록날짜 : ");
		bookregist = sc.next();
		
		System.out.print("책이름 : ");
		bookname = sc.next();
		Book tmp = new Book(bookclass, bookcode, bookregist, bookname);
		return tmp;

	}

	public void saveBook(Book user) {
		for(int i =0; i < this.BOOK_LIST.length; i++) {
			if(this.BOOK_LIST[i] == null) {
			   this.BOOK_LIST[i] = user;
			   System.out.println("분류\t분류코드\t등록날짜\t도서이름");
				System.out.println("-------------------------------------");
				System.out.print(this.BOOK_LIST[i].toString());
				System.out.print("도서정보가 정상적으로 등록되었습니다");
				break;
			}
		}
	}
	
	public void deleteBook() {
		Book selectMenu;
		int number;
	    System.out.print("삭제할 메뉴의 번호를 입력하세요: ");
	    number = sc.nextInt();

	    if (number >= 0 && number < BOOK_LIST.length) {
	    	selectMenu = BOOK_LIST[number];
	    	
	        if (selectMenu != null) {
	            for (int i = number; i < BOOK_LIST.length - 1; i++) {
	            	System.out.println(selectMenu.getBookname() + " 도서를 삭제하였습니다.");
	 	            BOOK_LIST[number] = null;
	 	            //삭제한 것부터 하나씩 뒤에꺼를 땡겨줘야한다.
	 	           
	 	            break;
	            }
	           
	        } else {
	            System.out.println("해당 메뉴가 목록에 존재하지 않습니다.");
	        }
	    } else {
	        System.out.println("올바른 메뉴 번호를 입력하세요.");
	    }
	}
		
		//맨마지막으로 추가된 도서를 삭제한다.
//		for(int i = this.BOOK_LIST.length - 1; i >= 0; i--) {
//			if (this.BOOK_LIST[i] != null ) {
//				System.out.print(this.BOOK_LIST[i].getBookname() + "도서를 삭제하였습니다.");
//				this.BOOK_LIST[i] = null;
//				break;
//			}
//		}

	


	public void viewBookList() {
		System.out.println("분류\t분류코드\t등록날짜\t도서이름");
		System.out.println("-------------------------------------");
		for (int i = 0; i < this.BOOK_LIST.length; i++) {
			if (this.BOOK_LIST[i] == null) 
				System.out.println("-\t-\t-\t-");
			else
				System.out.println(this.BOOK_LIST[i].toString());
		}
	}
	
	public void searchBook() {
		Book bookSearch;
		String bookname;
		
		System.out.print("검색할 도서이름을 적어주세요. : ");
		bookname = sc.next();
		
		for(int i = 0; i < BOOK_LIST.length; i++) {
			if(BOOK_LIST[i] == null) {
				System.out.print("검색한 도서를 찾을 수 없습니다.");
				break;
			}else if(BOOK_LIST[i].nameCheck(bookname)) {
				bookSearch = BOOK_LIST[i];
				System.out.println("분류\t분류코드\t등록날짜\t도서이름");
				System.out.println("-------------------------------------");
				System.out.print((BOOK_LIST[i].toString()));
				break;
			}
		}
			
	}
	
	public void updateBook() {
		Book selectMenu;
		int number;
		System.out.print("수정할 도서의 번호를 입력하세요 : ");
		number = sc.nextInt();
		selectMenu = BOOK_LIST[number];

		if(selectMenu == null) {
			System.out.print("해당메뉴가 목록에 존재하지 않습니다. : ");
		}else{
			System.out.print("수정할 정보를 입력하세요 (분류, 분류코드 , 등록날짜, 책이름): ");
			switch(sc.next()) {
				case "분류":
					sc.nextLine();
					System.out.print("새로운 분류를 입력하세요. : ");
					selectMenu.setBookclass(sc.nextLine());
					System.out.println("분류\t분류코드\t등록날짜\t도서이름");
					System.out.println("-------------------------------------");
					System.out.println(selectMenu.toString());
					break;
				case "분류코드":
					System.out.print("새로운 분류코드를 입력하세요. : ");
					selectMenu.setBookcode(sc.nextInt());
					System.out.println("분류\t분류코드\t등록날짜\t도서이름");
					System.out.println("-------------------------------------");
					System.out.println(selectMenu.toString());
					break;
				case "등록날짜":
					sc.nextLine();
					System.out.print("새로운 등록날짜 입력하세요. : ");
					selectMenu.setBookregist(sc.nextLine());
					System.out.println("분류\t분류코드\t등록날짜\t도서이름");
					System.out.println("-------------------------------------");
					System.out.println(selectMenu.toString());
					break;
				case "책이름":
					sc.nextLine();
					System.out.print("새로운 책이름 입력하세요. : ");
					selectMenu.setBookname(sc.nextLine());
					System.out.println("분류\t분류코드\t등록날짜\t도서이름");
					System.out.println("-------------------------------------");
					System.out.println(selectMenu.toString());
					break;
				default:
					System.out.println("잘못입력하셨습니다.");
			}
		}		
	}
	
	
	
}
