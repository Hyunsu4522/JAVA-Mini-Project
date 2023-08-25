package testProject;
import java.util.*;
import java.math.*;

public class Test_0801_array2_08 {
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
	}
		
}	

		
		


