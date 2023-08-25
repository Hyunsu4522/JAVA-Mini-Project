package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미",
			"박보배", "송성실", "윤예의", "진재주", "차천죽", "피풍표", "홍하하"};
		
		String[][] classRoom1 = new String[3][2];
		String[][] classRoom2 = new String[3][2];
		
		int index = 0;
		System.out.println("== 1 분단 ==");
		for (int i = 0; i < classRoom1.length; i++) {
			for(int j = 0; j < classRoom1[i].length; j++) {
				classRoom1[i][j] = students[index++];
				System.out.print(classRoom1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2 분단 ==");
		for (int i = 0; i < classRoom2.length; i++) {
			for(int j = 0; j < classRoom2[i].length; j++) {
				classRoom2[i][j] = students[index++];
				System.out.print(classRoom2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String target = sc.next();
		
		int bundan = 0, line= 0, isRight= 0;
		boolean isTrue = false;
		
		for (int i = 0; i < classRoom1.length && !isTrue; i++) {
			for(int j = 0; j < classRoom1[i].length && isTrue; j++) {
				if(classRoom1[i][j].equals(target)) {
					bundan = 1;
					line = i;
					isRight = j;
					isTrue = true; //찾았으면 멈춰라
				}
			}
			System.out.println();
		}
		
		if(!isTrue) {
			for (int i = 0; i < classRoom2.length&& !isTrue; i++) {
				for(int j = 0; j < classRoom2[i].length&& !isTrue; j++) {
					if(classRoom2[i][j].equals(target)) {
						bundan = 2;
						line = i;
						isRight = j;
						isTrue = true;
					}
				}
			}
			
		}
		if(isTrue) {
			System.out.print("검색하신 " + target + " 학생은 " + bundan + 
					"분단 "+ (line == 0 ? ("첫번째") : (line == 1 ? ("두번째") : ("세번째")))+
					" 줄"+ " " + (isRight == 0 ? "왼쪽" : "오른쪽")+"에 있습니다.");
		}else {
			System.out.println("검색하신" + target + "학생은 찾지 못했습니다.");
		}
		
		
		
		
	}
		
}	

		
		


