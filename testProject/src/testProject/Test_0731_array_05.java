package testProject;
import java.util.*;

public class Test_0731_array_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String str; //검색할 문자열
		char ch; //찾을 문자하나
		int[] strLoc; //위치값(인텍스) 저장
		int count = 0;
		
		System.out.print("문자열 : ");
		str = sc.next();
		
//		strLoc = new int[str.length()];
		
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		
		//ch가 존재하는 위치 구하기
		System.out.print(str + "에 " + ch + "(이)가 존재하는 위치(인덱스) :");
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.print("\n" + ch + "개수 :" + count);
		
	//배열로 풀기	
		
//		String str; //검색할 문자열
//		char ch; //찾을 문자하나
//		int[] strLoc; //위치값(인텍스) 저장
//		char[] chrLoc;
//		int count = 0;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		chrLoc = new char[str.length()];
//
//		
//		System.out.print("문자 : ");
//		ch = sc.next().charAt(0);
//		
//		System.out.print("application에 i가 존재하는 위치(인덱스) :");
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == ch) {
//				chrLoc[i] = 'x';
//				count++;
//			}
//		}
//		System.out.print("\n" + ch + "개수 :" + count);


	}
}
