package com.kh.javah;
import java.util.*;

import com.kh.javai.Customer;
import com.kh.javai.POSSystem;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Book[] bookArr = new Book[10];
//		
//
//		System.out.println();
//		boolean isFinish = false;
//		while(!isFinish) {
//			int num;
//			System.out.println();
//			System.out.println("원하시는 메뉴의 버튼을 클릭하세요.");
//			System.out.println("--------------------------");
//			System.out.println("1. 도서등록");
//			System.out.println("2. 도서삭제");
//			System.out.println("3. 전체도서목록조회");
//			System.out.println("4. 도서검색 (이외 다른버튼을 누르면 종료)");
//			System.out.println("--------------------------");
//			
//			switch(sc.nextInt()){
//				case 1:
//					//도서등록
//					for(int i =0; i < bookArr.length; i++) {
//					if(bookArr[i] == null) {
//						String bookclass, bookcode, bookregist, bookname;
//						
//						System.out.print("분류 : ");
//						bookclass = sc.next();
//						
//						System.out.print("분류코드 :");
//						bookcode = sc.next();
//						
//						System.out.print("등록날짜 : ");
//						bookregist = sc.next();
//						
//						System.out.print("책이름 : ");
//						bookname = sc.next();
//						
//						bookArr[i] = new Book(bookclass, bookcode, bookregist, bookname);
//						
//						System.out.print(bookArr[i].toString());
//						System.out.println("도서가 정상적으로 등록되었습니다");
//						break;
//					}else if(i == bookArr.length - 1){
//						System.out.println("더이상 도서를 등록할 수 없습니다.");
//					}
//				}break;
//				case 2:
//					//도서삭제
//					//마지막으로 등록된 도서를 삭제한다.
//					for(int i = bookArr.length - 1; i >=0; i--) {
//					if (bookArr[i] != null) {
//						bookArr[i] = null;
//						break;
//					}
//				}break;
//				case 3:
//					//전체 도서목록 조회
//					System.out.println("분류\t분류코드\t등록날짜\t도서이름");
//					for(int i = 0; i < bookArr.length; i++) {
//						if(bookArr[i] == null)
//							break;
//						System.out.print(bookArr[i].toString());
//					}break;
//				case 4:
//					//도서검색
//					Book bookSearch;
//					String bookname;
//					
//					System.out.print("검색할 도서이름을 적어주세요. : ");
//					bookname = sc.next();
//					
//					for(int i = 0; i < bookArr.length; i++) {
//						if(bookArr[i] == null) {
//							System.out.print("검색한 도서를 찾을 수 없습니다.");
//							break;
//						}else if(bookArr[i].nameCheck(bookname)) {
//							bookSearch = bookArr[i];
//							System.out.print((bookArr[i].toString()));
//							break;
//						}
//			
//					}break;
//				default:
//					isFinish = true;
//			}
//			
//		}
		
		SOsystem so = SOsystem.getSOInstance();
		
		boolean isLoop = true;
		while(isLoop) {
			switch(so.printBookList()) {
				case 1:{ //도서등록
					so.addBook();
				}break;
				case 2:{ //도서삭제
					so.deleteBook();
				}break;
				case 3:{ //도서전체목록출력
					so.viewBookList();
				}break;
				case 4:{ //도서검색
					so.searchBook();
				}break;
				case 5:{//도서수정
					so.updateBook();
				}break;
				default:
					isLoop = false;
			}
		}
		
		
		
		
	}
}
