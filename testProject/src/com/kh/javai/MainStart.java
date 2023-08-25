package com.kh.javai;
import java.util.*;
import java.util.Scanner;

//main 메서드를 실행해주기 위한 class
public class MainStart {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		//인스턴스 객체생성 방법
		//클래스 객체 이름 = new 생성자(클래스와 이름이 동일한 메서드)
//		Student choi = new Student("최지원", 48, "여자");
//		Student park = new Student("박수현", 28, "여자");
		
		//아래 두 코드를 실행되면 각기 다른 결과값이 나타난다
		//이를통해 각기 다른 메모리공간을 확보하고 사용한다는 것을 알 수 있다.
//		choi.info();
//		park.info();
		
		
		//영어점수 수학점수 국어점수를 입력받아
		//각 과목이 40점 이상이고, 평균이 60점 이상일때 합격
		//조건을 충족하지 못하면 불합격을 나타내주는 프로그램 작성
//		Student choi = new Student("박수현", 28, "여자");
//		
//		int en, ko, math;
//		System.out.print("영어점수 : ");
////		en = sc.nextInt();
////		choi.setEnScore(en);
//		choi.setEnScore(sc.nextInt());
//		
//		System.out.print("국어점수 : ");
//		choi.setKoScore(sc.nextInt());
//		
//		System.out.print("수학점수 : ");
//		choi.setMathScore(sc.nextInt());
		
//		System.out.println("총 합 : "+ choi.getTotal());
//		System.out.println("평균  : "+ choi.getAvg());
//		System.out.println("영어점수 : " + choi.getEnScore());
//		System.out.println("국어점수 : " + choi.getKoScore());
//		System.out.println("수학점수 : " + choi.getMathScore());
//		choi.cheakPass();
		
//		choi.displatMyInfo();
//		
//		if(ko >= 40 && en >= 40 && math >= 40 && ((ko + en + math) / 3.0f) >= 60) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
	
//-----------------------------------------------------/		
//		Car suhyunCar = new Car("흰색", "bmw", "중형", "가솔린", "2023-08-04", 150, 5, 100);
//		suhyunCar.statusDisplay(1);
		
		//행동을 입력받고 진행하는 프로그램을 작성하세요
		//1. 달린다.
		//2. 멈춘다.
		//3. 기름을 충전한다.
		//4. 속도와 잔여기름양을 확인한다.
		//다른버튼을 누르면 종료
//		
//		boolean isFinish = false;
//		while(!isFinish) {
//			int num;
//			System.out.println("원하는 행동의 버튼을 클릭하세요.");
//			System.out.println("-------------------------");
//			System.out.println("1. 달린다.");
//			System.out.println("2. 멈춘다.");
//			System.out.println("3. 기름을 충전한다.");
//			System.out.println("4. 속도와 잔여기름양을 확인한다.");
//			System.out.println("다른버튼을 누르면 종료");
//			System.out.println("-------------------------");
//			
//			
//			num = sc.nextInt();
//			switch(num) {
//				case 1:
//					suhyunCar.onAxel();
//					suhyunCar.statusDisplay(2);
//					break;
//				case 2:
//					suhyunCar.onBreak();
//					suhyunCar.statusDisplay(2);
//					break;
//				case 3:
//					System.out.println("얼마나 충전하시겠습니까?");
//					int cc = sc.nextInt();
//					suhyunCar.insertCc(cc);
//					break;
//				case 4:
//					suhyunCar.statusDisplay(2);
//				default:
//					isFinish = true;
//			}
//		
//		}
//		
		//packge com.kh.javai;
		//static 관련 : static은 => class
		//class로 쓰기
//		Student park = new Student("소망", 26, "남자");
//		Student kim = new Student("사랑", 23, "여자");
//		Student yoon = new Student("희망", 24, "남자");
//		Student.showCount();
		
		
		//객체이름이 각각 yoon, choi, kim인 student 객체를 생성하라
//		Student yoon = new Student("윤지원", 15, "남자");
//		Student choi = new Student("최소연", 25, "여자");
//		Student kim = new Student("김기범", 42, "남자");
//		
//		Student[] iban = new Student[3];
//		iban[0] =  new Student("윤지원", 15, "남자");
//		iban[1] =  new Student("최소연", 25, "여자");
//		iban[2] =  new Student("김기범", 42, "남자");
		
		
		
		//최대 학생에 수는 30인 클래스(i, h, j)를 3개 만들어라
//		char classRoom;
//		int choice;
//		
//		Student[] iban = new Student[30];
//		Student[] jban = new Student[30];
//		Student[] hban = new Student[30];
//		Student[] selectBan;
//	
//		while(true) {
//			//관리할 클래스를 선택해 주세요. (i, j, h)
//			System.out.print("관리할 클래스를 선택해 주세요. (i, j, h반 중 선택 다른키워드 입력시 종료) : ");
//			classRoom = sc.next().charAt(0);
//			
//			switch(classRoom){
//				case 'i':
//					selectBan = iban;
//					break;
//				case 'j':
//					selectBan = jban;
//					break;
//				case 'h':
//					selectBan = hban;
//					break;
//				default:
//					selectBan = null;
//			}
//			if(selectBan == null)
//				break;
//			boolean isTrue = true;
//			while(isTrue) {
//				System.out.print("1.학생추가" + " ");
//				System.out.print("2.학생제거" + " ");
//				System.out.print("3.학생목록확인" + " ");
//				System.out.print("4.학생조회" + " ");
//				System.out.print("//기타 입력시 뒤로" + " ");
//				
//				switch(sc.nextInt()){
//					case 1:{
//						// selectBan의 마지막 빈자리를 찾는다.
//						int index = 0;
//						while(index < selectBan.length && selectBan[index] != null) {
//							index++;
//						}
//						if(index == selectBan.length)
//							System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
//						else {
//							System.out.println("추가할 학생의 이름, 나이, 성별을 입력해 주세요.");
//							selectBan[index]  = new Student(sc.next(), sc.nextInt(), sc.next());
//							}
//						}break;
//						case 2:{
//							int index = 0;
//							while(index < selectBan.length && selectBan[index] != null) {
//								index++;
//							}
//							if (index == 0)
//								System.out.println("삭제할 학생이 없습니다.");
//							else
//								selectBan[index - 1] = null;
//								Student.count--;
//						}break;
//						case 3:{
//							System.out.println("------------");
//							System.out.println("이름\t나이\t성별");
//							for(int i = 0; i < selectBan.length; i++) {
//								if(selectBan[i] == null)
//									break;
//								selectBan[i].info();
//							}
//							System.out.println("------------");
//						}break;	
//						case 4:{
//							//조회할 학생의 정보를 입력하세요(이름, 나이, 성별)
//							//해당 학생은 이미 등록 완료되었습니다.
//							//or 해당학생을 찾을 수 없습니다.
//							System.out.println("조회할 학생의 이름, 나이, 성별을 입력해 주세요.");
//							String name = sc.next();
//							int age = sc.nextInt();
//							String gender = sc.next();
//							Student tmp = null;
//							
//							for(int i = 0; i < selectBan.length; i++) {
//								if(selectBan[i] == null)
//									break;
//								else if (selectBan[i].equals(name, age, gender)) {
//									tmp = selectBan[i];
//									break;
//								}
//							}
//							if(tmp != null)
//								System.out.println("해당 학생은 이미 등록 완료되었습니다.");
//							else
//								System.out.println("해당 학생을 찾을 수 없습니다.");
//						}break;
//						default:
//							isTrue = false;
//					}
//				}
//			}
//			System.out.print("총 학생 " + Student.count + "명을 등록 완료하였습니다.");
			
			POSSystem pos = POSSystem.getPosInstance();
			pos.saveCustomer(new Customer("김소망","myId","mypassword12","asd123@naver.com"));
			
			boolean isLoop = true;
			while(isLoop) {
				switch(pos.printMenu()) {
					case 1:{ //회원등록
						pos.joinCustomer();
					}break;
					case 2:{ //회원삭제
						pos.deleteLastCustomer();
					}break;
					case 3:{ //회원목록출력
						pos.viewCustomerList();
					}break;
					case 4:{ //로그인
						pos.login();
					}break;
					default:
						isLoop = false;
				}
			}
		
		
			//길이가 10인 Customer 객체배열을 생성하고
//			Customer[] customerArr = new Customer[10];
			//0번째 인덱스값에 id : myId, password : mypassword12로 객체생성(이름 이메일 자유)
//			customerArr[0] = new Customer("김소망","myId","mypassword12","asd123@naver.com");

			
			//++-------------------------회원삭제----------------------------++
			//마지막으로 등록된 회원을 삭제한다.
//			for(int i = 1; i < customerArr.length; i++) {
//				if (customerArr[i] == null) {
//					customerArr[i - 1] = null;
//					break;
//				}else if(i == customerArr.length - 1) {
//					customerArr[i - 1] = null;
//				}
//			}
//			//뒤에서
//			for(int i = customerArr.length - 1; i >=0; i--) {
//				if (customerArr[i] != null) {
//					customerArr[i] = null;
//					break;
//				}
//			}
			//---------------------------회원삭제------------------------------
		
			
			
			//++-------------------------모든 회원 출력----------------------------++
			//이름 아이디 비밀번호 이메일
//			System.out.println("이름\t아이디\t비밀번호\t\t이메일");
//			for(int i = 0; i < customerArr.length; i++) {
//				if(customerArr[i] == null)
//					break;
//				System.out.print(customerArr[i].toString());
//			}
			//---------------------------모든 회원 출력------------------------------
			
			
			
			//++-------------------------회원가입----------------------------++
			//아이디, 비밀번호, 이름, 이메일을 입력받아 Customer객체를 추가해보자
			/*
			 * 아이디를 입력하세요 : 
			 * 비밀번호를 입력하세요 : 
			 * 이름를 입력하세요 : 
			 * 이메일를 입력하세요 : 
			 * 
			 * 이름 : ooo
			 * 이메일 : ooo
			 * ID : ooo
			 * Password : ooo
			 * 회원정보가 정상적으로 등록되었습니다.
			*/
			
			
//			for(int i =0; i < customerArr.length; i++) {
//				if(customerArr[i] == null) {
//					String name, pw, id, email;
//					System.out.print("아이디를 입력하세요 : ");
//					name = sc.next();
//					
//					System.out.print("비밀번호를 입력하세요 :");
//					pw = sc.next();
//					
//					System.out.print("이름를 입력하세요 : ");
//					id = sc.next();
//					
//					System.out.print("이메일를 입력하세요 : ");
//					email = sc.next();
//					customerArr[i] = new Customer(name, pw, id, email);
//					
//					System.out.print(customerArr[i].toString());
//					System.out.print("회원정보가 정상적으로 등록되었습니다");
//					break;
//				}else if(i == customerArr.length - 1){
//					System.out.print("더이상 회원을 등록할 수 없습니다.");
//				}
//			}
			//---------------------------회원가입-----------------------------
			
			
			
			//++-------------------------로그인----------------------------++
//			Customer loginCustomer;
//			String id, pw;
//			
//			System.out.print("아이디 : ");
//			id = sc.next();
//			System.out.print("비밀번호 : ");
//			pw = sc.next();
//			
//			for(int i = 0; i < customerArr.length; i++) {
//				if(customerArr[i] == null) {
//					System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//					break;
//				}else if(customerArr[i].equals(id, pw)) {
//					loginCustomer = customerArr[i];
//					System.out.print("로그인 성공");
//					break;
//				}else if(customerArr[i].idCheck(id)){
//					System.out.print("비밀번호가 틀렸습니다.");
//					break;
//				}
//				else if(i == customerArr.length - 1){
//					System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//				}
//
//			}
			//---------------------------로그인------------------------------
			
	}
}
