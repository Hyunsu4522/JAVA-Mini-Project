package testProject;
import java.util.*;

public class Test_0731_array_00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//자료형[] 배열이름 = new 자료형[길이];
//		int[] ref = new int[5]; // 길이가 5인 int형
		//같음
//		int[] ref;
//		ref = new int[5];
		
		
		
		//길이 저장소 참조
//		int[] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0] + ar[1] + ar[2];
//		System.out.print(num);
		
		
		
		//배열 초기화
//		int[] ar = new int[10]; //기본 자료형 = 0으로 초기화
//		String[] ar = new String[10]; //객체배열 = null으로 초기화
		
//		int[] arr = new int[3]; //배열 생성
//		int[] arr = new int[] {1, 2, 3}; //배열 생성 및 초기화1
//		int[] arr = {1, 2, 3}; //배열 생성 및 초기화2
		
		
		
		//EX)
		//길이가 5인 int형 1차원 배열 생성
//		int[] ar1 = new int[5]; 
		
		//길이가 7인 double형 1차원 배열 ar2생성
//		double[] ar2 = new double[7]; 
		
		//배열의 변수선언과 메모리할당을 분리하여 길이가 9인 float형 배열 ar3생성
//		float[] ar3;
//		ar3 = new float[9]; 
		
//		System.out.println("ar1의 길이 :" + ar1.length);
//		System.out.println("ar2의 길이 :" + ar2.length);
//		System.out.println("ar3의 길이 :" + ar3.length);
		
		
		
//		//EX)
//		String str ="suhyun";
//		System.out.println("str의 길이 :" + str.length());
		
		
		
		//EX)
//		String str[] = new String[5];
//		str[0] = "jiwon";
//		str[1] = new String("cafe");
//		str[2] = "tree";
//		str[3] = "choi";
//		str[4] = "hi";
//		
//		int count = 0;
//		
//		for (int i = 0; i < str.length; i++)
//			count += str[i].length();
//		
//		System.out.println("총 문자의 수는 :" + count);
		
		
		//얕은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.println(arr1[2]);
		
		
		//깊은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
		
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		//반복문을 통해서 arr1, arr2에 있는 모든 요소 출력
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println("arr1[" + i + "] :" + arr1[i] );
//		}
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println("arr2[" + i + "] :" + arr2[i] );
//		}
		
		//보편적인 배열 복사방법
//		arr2 = arr1.clone();
		
		//배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7);
		
		
		//int형 변수 num을 생성하고 값을 10으로 초기화
		int num = 10;
		
		//String형 변수 str을 생성하고 값을 "hi"로 초기화
		String str ="hi";
		
		//num과 str을 출력
		System.out.println(num);
		System.out.println(str);
		
		//만약 num이 5보다 크다면 "num은 5보다 큰 수 입니다" 출력
		//더 작다면 "num은 5보다 작은 수 입니다" 출력
		//5라면 "num은 5입니다" 출력
		if (num > 5) {
			System.out.println("num은 5보다 큰 수 입니다");
		}else if(num < 5) {
			System.out.println("num은 5보다 작은 수 입니다");
		}else {
			System.out.println("num은 5입니다");
		}
		
		//반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
		//ex) num = 3일때 1 2 3출력
		//for while각각 작성
		for(int i = 1; i <= num; i++) {
			System.out.print(i+ " ");
		}
		int i = 0;
		while(i <= num) {
			System.out.print(i+ " ");
			i++;
		}
		//길이가 20인 int형 배열 arr생성후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
		int[] arr = new int[20];
		for(int j = 1; j <= arr.length; j++) {
			arr[j - 1] = j;
		}
				
		//반복문을 이용하여 arr 요소 전체출력
		int[] arr1 = new int[20];
		
		for(int j = 1; j <= arr1.length; j++) {
			System.out.print(arr[j]);
		}

		//String형 길이가 5인 배열 arr2을 생성하고 생성과 동시에 {"사과", "포도","귤","파인애플", "바나나"}로 초기화
		String arr2[] = {"사과", "포도","귤","파인애플", "바나나"};
		
		//반목문을 이용하여 arr2 요소 전체출력
		for(int a = 1; a <= arr2.length; a++) {
			System.out.print(arr2[i]);
		}
	
	
	}	
}
