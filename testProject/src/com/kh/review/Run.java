package com.kh.review;
import java.util.*;


public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
		
		//입력받은 값 num이 10보다 작은 정수이면 small을 출력
		//아니면 big을 출력
//		if(num < 10) {
//			System.out.println("small");
//		}else {
//			System.out.println("big");
//		}
		
		//입력한 값 num이 1,2,3이면 1,2,3중에 하나입니다.
		//아니면 예외입니다.
//		switch(num) {
//			case 1:
//			case 2:
//			case 3:
//				System.out.println("1,2,3중에 하나입니다.");
//				break;
//			default:
//				System.out.println("예외입니다.");
//		}
		
		//1부터 num까지 반복하면서 홀수(2로 나눴을 때 나머지가 1)출력
//		for(int i = 1; i <= num; i++) {
//			if(i % 2 == 1) {
//				System.out.println(i + " 홀수");
//			}else {
//				System.out.println(i + " 짝수");
//			}
//		}
		
		//String str변수를 만들고 값을 입력받아라
		
		//만약 값이 "멈춰"일때 까지 반복해서 입력받아라
		//"멈춰"가 아니라면 "다시 입력해주세요" 출력
		//특정 조건이 성립될때 까지 반복해라 => while
		
//		while(true) {
//			System.out.println("멈춰를 입력해주세요 : ");
//			String str = sc.next();
//			
//			if(str.equals("멈춰")) {
//				System.out.println("정답");
//				break;
//			}else {
//				System.out.println("다시 입력해주세요.");
//			}
//		}
		
		//문자열을 하나 입력받고 길이가 10이상일때 까지 반복해서 입력받아라
		//문자열을 입력해주세요 :
		
//		while(true) {
//			System.out.print("10이상인 문자열을 입력해주세요 : ");
//			String str = sc.next();	
//			if(str.length() >= 10) {
//				break;
//			} 
//		}
		
		//int형 자료형 num을 하나 입력받아
		//길이가 num인 int형 1차원 배열 arr을 생성하고
		//arr[0] ~ arr의 길이 끝까지 1부터 1씩 커지면서 순차적으로 저장시키고 출력
		
//		int num = sc.nextInt();
//		int[] arr = new int [num];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}
		
		//class이름 참조변수명 = new 생성자();
//		Human suhyun = new Human();
//		suhyun.setName("박수현");
//		suhyun.setAge(28);
//		System.out.println(suhyun.getName() + " " + suhyun.getAge());
//
//		Car car = new Car();
//		car.setColor("분홍색");
//		car.setYear(2023);
//		car.setType("중형");
//		System.out.println(car.getColor() + " " + car.getYear() + "년형 " +car.getType() + "차");
//		
//
//		Student student = new Student();
//		student.setGroup(2);
//		student.setNumber(23);
//		student.setName("박수현");
//		System.out.println(student.getGroup() + "반 " + student.getNumber() + "번 " + "이름:" +student.getName());
//		
//		Tea tea = new Tea();
//		tea.setTemperature("차가운");
//		tea.setTaste("녹차");
//		tea.setNumber(2);
//		System.out.println(tea.getTemperature() + " " + tea.getTaste() + "맛 " +tea.getNumber()+ "잔");
		
//		Human kim = new Human("김소망", 15 , "2012511-2xxxxxx ", 'f');
//		Human choi = new Human("최지원", 45 , "9012511-2xxxxxx ", 'f');
//		kim.setAge(12);
		
//		System.out.println(kim.toString()); 
		
		//Human 클래스 내부에 나이에 +10을 더해서
		//"제 10년후 나이는 oo살입니다."의 스트링값을 반환하는
		//매서드를 만들어 주세요.
//		System.out.println(kim.getFutureAge());
		
		//크기가 3인 Human 객체배열 arr을 만들고
		//kim과 choi와 똑같은 데이터로 0번,1번째 인덱스에 생성하라
		
//		Human kim = new Human("김소망", 15 , "2012511-2xxxxxx ", 'f');
//		Human choi = new Human("최지원", 45 , "9012511-2xxxxxx ", 'f');
//		
//		int[] arr2 = new int[3];
//		Human[] arr = new Human[3];
//		arr[0] = new Human("김소망", 15 , "2012511-2xxxxxx ", 'f');
//		arr[1] = new Human("최지원", 45 , "9012511-2xxxxxx ", 'f');
//		
//		kim.setName("김씨아님");
//		
//		arr[0].setName("사실내가kim");
//		
//		System.out.println(kim.toString());
//		System.out.println(arr[0].toString());
//		System.out.println(arr[1].toString());
		
//		Human[] arr = new Human[10];
//		ArrayList<Human> list = new ArrayList<>();
//		
//		arr[0] = new Human("choi", 21, "201111-xxxxxxx", 'm');
//		arr[1] = new Human("kim", 23, "201111-xxxxxxx", 'm');
//		arr[2] = new Human("jin", 25, "201111-xxxxxxx", 'm');
//		
////		arr[1] = null;
////		arr[1] = arr[2];
////		arr[2] = null;
//		
//		System.out.print(arr[1].getAge());
//		
//		list.add(new Human("choi", 21, "201111-xxxxxxx", 'm'));
//		list.add(new Human("kim", 23, "201111-xxxxxxx", 'm'));
//		list.add(new Human("jin", 25, "201111-xxxxxxx", 'm'));
//		
//		list.remove(1);
//		
//		System.out.print(list.get(1));
		
		Human jiwon = new Human("choi", 21, "201111-xxxxxxx", 'm');
		Book[] jiwonBookList = jiwon.getBookList();
		jiwonBookList[0] = new Book("꿈꾸는 다락방");
		String jiwonName = jiwon.getName();
		System.out.print(jiwonName);
	}
}
